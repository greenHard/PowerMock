package com.zhang.powermock.mockstatic.service;

import com.zhang.powermock.mockstatic.domain.User;
import com.zhang.powermock.mockstatic.reposity.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UserDao.class)
public class UserServiceTest {

    @Test
    public void testGetTotal() {
        PowerMockito.mockStatic(UserDao.class);
        UserService userService = new UserService();
        PowerMockito.when(UserDao.getTotal()).thenReturn(10);
        int total = userService.getTotal();
        assertEquals(10,total);
    }

    @Test
    public void testInsertUser() {
        User user = new User();
        PowerMockito.mockStatic(UserDao.class);
        UserService userService = new UserService();
        PowerMockito.doNothing().when(UserDao.class);
        userService.insertUser(user);
        PowerMockito.verifyStatic();
    }
}