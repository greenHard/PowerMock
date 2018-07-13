package com.zhang.powermock.local.service;

import com.zhang.powermock.local.domain.User;
import com.zhang.powermock.local.reposity.UserDao;

/**
 * @author zhang yuyang
 * @ClassName: com.zhang.powermock.local.service.UserService
 * @Description: 用户service层
 * @create 2018/05/03 13:53
 */
public class UserService {

    /**
     * 获得所有用户的数量
     * @return
     */
    public int getTotal(){
        UserDao userDao = new UserDao();
        return userDao.getTotal();
    }

    /**
     * 插入一个用户
     * @param user
     */
    public void insertUser(User user){
        UserDao userDao = new UserDao();
        userDao.insertUser(user);
    }
}
