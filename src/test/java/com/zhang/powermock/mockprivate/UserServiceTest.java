package com.zhang.powermock.mockprivate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UserService.class)
public class UserServiceTest {

    @Test
    public void exist() {
        UserService userService = PowerMockito.spy(new UserService());
        String userName = "zhang";
        try {
            PowerMockito.doNothing().when(userService, "checkExist", userName);
            boolean exist = userService.exist(userName);
            assertTrue(exist);
            PowerMockito.verifyPrivate(userService).invoke("checkExist", userName);
        } catch (Exception e) {
            fail();
        }
    }
}