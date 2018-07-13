package com.zhang.powermock.construction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UserService.class)
public class UserServiceTest {

    @Test
    public void testInsertUser() throws Exception {
        User user = new User();
        UserDao userDao = PowerMockito.mock(UserDao.class);
        PowerMockito.whenNew(UserDao.class).withArguments(false,Dialect.MYSQL).thenReturn(userDao);
        UserService userService = new UserService();
        userService.insertUser(user);
        Mockito.verify(userDao).insertUser(user);
    }
}