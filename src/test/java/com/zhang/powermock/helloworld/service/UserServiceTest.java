package com.zhang.powermock.helloworld.service;

import com.zhang.powermock.helloworld.domain.User;
import com.zhang.powermock.helloworld.reposity.UserDao;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.tests.utils.impl.PowerMockIgnorePackagesExtractorImpl;

import static org.junit.Assert.*;

public class UserServiceTest {

    @Mock
    private UserDao uDao;

    private UserService userService;

    @Before
    public void setUp() throws Exception {
        final UserService userService = new UserService(new UserDao());
    }

    @Test
    @Ignore
    public void testGetTotalWithJunit() {
        int total = userService.getTotal();
        assertEquals(10,total);
    }

    @Test
    public void testGetTotalWithMockito() {
        MockitoAnnotations.initMocks(this);
        UserService service = new UserService(uDao);
        Mockito.when(uDao.getTotal()).thenReturn(10);
        int total = service.getTotal();
        assertEquals(10,total);
    }

    @Test
    public void testGetTotalWithPowerMock() {
        UserDao userDao = PowerMockito.mock(UserDao.class);
        PowerMockito.when(userDao.getTotal()).thenReturn(10);
        UserService userService = new UserService(userDao);
        int total = userService.getTotal();
        assertEquals(10,total);
    }

    @Test
    public void testInsertUserWithPowerMock() {
        UserDao userDao = PowerMockito.mock(UserDao.class);
        User user = new User();
        PowerMockito.doNothing().when(userDao).insertUser(user);
        UserService userService = new UserService(userDao);
        userService.insertUser(user);
        // 校验方法是否被调用
        Mockito.verify(userDao).insertUser(user);
    }
}