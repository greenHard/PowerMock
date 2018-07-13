package com.zhang.powermock.mockstatic.service;

import com.zhang.powermock.mockstatic.domain.User;
import com.zhang.powermock.mockstatic.reposity.UserDao;

/**
 * @author zhang yuyang
 * @ClassName: com.zhang.powermock.mockstatic.service.UserService
 * @Description: 用户service层
 * @create 2018/05/03 13:53
 */
public class UserService {

    /**
     * 获得所有用户的数量
     * @return
     */
    public int getTotal(){
        return UserDao.getTotal();
    }

    /**
     * 插入一个用户
     * @param user
     */
    public void insertUser(User user){
        UserDao.insertUser(user);
    }
}
