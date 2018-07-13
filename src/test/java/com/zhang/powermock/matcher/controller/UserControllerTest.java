package com.zhang.powermock.matcher.controller;

import com.zhang.powermock.matcher.service.UserService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UserService.class)
public class UserControllerTest {

    @Test
    @Ignore
    public void testGetMailWithMatch() {
        UserService userService = PowerMockito.mock(UserService.class);
        PowerMockito.when(userService.findEmailByUserName(Mockito.argThat(new ArgumentMatcher<String>() {
            public boolean matches(Object argument) {
                String arg = (String) argument;
                if (arg.startsWith("zhang") || arg.startsWith("zyy")) {
                    return true;
                } else {
                    throw new RuntimeException();
                }
            }
        }))).thenReturn("m17612184394@163.com");

        try {
            PowerMockito.whenNew(UserService.class).withAnyArguments().thenReturn(userService);
            UserController userController = new UserController();
            String zhang = userController.getMail("zhang");
            assertEquals("m17612184394@163.com", zhang);

            userController.getMail("yu");
            fail("should not process to here is right !");
        } catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
        }
    }

    @Test
    public void testGetMailWithAnswer() {
        UserService userService = PowerMockito.mock(UserService.class);
        PowerMockito.when(userService.findEmailByUserName(Mockito.anyString())).thenAnswer(invocation -> {
            String arg = (String) invocation.getArguments()[0];
            switch (arg) {
                case "zhang":
                    return "m17612184394@163.com";
                case "zhangsan":
                    return "zhangsan@qq.com";
                default:
                    throw new RuntimeException();
            }
        });

        try {
            PowerMockito.whenNew(UserService.class).withAnyArguments().thenReturn(userService);
            UserController userController = new UserController();
            String zhang = userController.getMail("zhang");
            assertEquals("m17612184394@163.com", zhang);

            userController.getMail("yu");
            fail("should not process to here is right !");
        } catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
        }
    }
}