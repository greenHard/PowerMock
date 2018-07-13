package com.zhang.powermock.mockfinal.service;

import com.zhang.powermock.mockfinal.domain.User;
import com.zhang.powermock.mockfinal.reposity.UserDao;

/**
 * @author zhang yuyang
 * @ClassName: com.zhang.powermock.mockfinal.service.UserService
 * @Description: 用户service层
 * @create 2018/05/03 13:53
 */
public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 获得所有用户的数量
     * @return
     */
    public int getTotal(){
        return userDao.getTotal();
    }

    /**
     * 插入一个用户
     * @param user
     */
    public void insertUser(User user){
        userDao.insertUser(user);
    }
}
