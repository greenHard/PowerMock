package com.zhang.powermock.mockfinal.service;

import com.zhang.powermock.mockfinal.domain.User;
import com.zhang.powermock.mockfinal.reposity.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UserDao.class)
public class UserServiceTest {

    @Test
    public void getTotal() {
        UserDao userDao = PowerMockito.mock(UserDao.class);
        PowerMockito.when(userDao.getTotal()).thenReturn(10);
        UserService userService = new UserService(userDao);
        int total = userService.getTotal();
        assertEquals(10,total);
    }

    @Test
    public void insertUser() {
        User user = new User();
        UserDao userDao = PowerMockito.mock(UserDao.class);
        PowerMockito.doNothing().when(userDao).insertUser(user);
        UserService userService = new UserService(userDao);
        userService.insertUser(user);
        Mockito.verify(userDao).insertUser(user);
    }
}