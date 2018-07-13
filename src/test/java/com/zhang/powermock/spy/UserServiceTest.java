package com.zhang.powermock.spy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;

import static org.junit.Assert.*;

public class UserServiceTest {

    @Test
    public void write() {
        // UserService userService = PowerMockito.mock(UserService.class);
        UserService userService = PowerMockito.spy(new UserService());
        userService.write();
    }
}