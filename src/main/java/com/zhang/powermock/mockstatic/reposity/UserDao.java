package com.zhang.powermock.mockstatic.reposity;

import com.zhang.powermock.mockstatic.domain.User;

/**
 * @author zhang yuyang
 * @ClassName: com.zhang.powermock.mockstatic.reposity.UserDao
 * @Description: 用户dao层
 * @create 2018/05/03 13:50
 */
public class UserDao {

    public static int getTotal(){
        throw new UnsupportedOperationException("not supported");
    }

    public static void insertUser(User user){
        throw new UnsupportedOperationException("not supported");
    }
}
