package com.zhang.powermock.matcher.controller;

import com.zhang.powermock.matcher.service.UserService;

/**
 * @author zhang yuyang
 * @ClassName: com.zhang.powermock.matcher.controller.UserController
 * @Description:
 * @create 2018/05/03 16:49
 */
public class UserController {
    public String getMail(final String userName) {
        UserService userService = new UserService();
        String email = userService.findEmailByUserName(userName);
        return email;
    }
}
