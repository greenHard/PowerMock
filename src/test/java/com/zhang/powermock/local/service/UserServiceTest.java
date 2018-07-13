package com.zhang.powermock.local.service;

import com.zhang.powermock.local.domain.User;
import com.zhang.powermock.local.reposity.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

/**
 * mock 本地变量
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(UserService.class)
public class UserServiceTest {

    @Test
    public void testGetTotal(){
        UserDao userDao = PowerMockito.mock(UserDao.class);
        try {
            PowerMockito.whenNew(UserDao.class).withNoArguments().thenReturn(userDao);
            UserService userService = new UserService();
            PowerMockito.when(userDao.getTotal()).thenReturn(10);
            int total = userService.getTotal();
            assertEquals(10,total);
        }catch (Exception e){
            fail("测试失败");
        }
    }

    @Test
    public void testInsertUser() {
        UserDao userDao = PowerMockito.mock(UserDao.class);
        try {
            User user = new User();
            PowerMockito.whenNew(UserDao.class).withAnyArguments().thenReturn(userDao);
            UserService userService = new UserService();
            userService.insertUser(user);
            Mockito.verify(userDao).insertUser(user);
        }catch (Exception e){
            fail("测试失败");
        }
    }
}