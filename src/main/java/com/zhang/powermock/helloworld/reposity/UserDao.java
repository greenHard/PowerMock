package com.zhang.powermock.helloworld.reposity;

import com.zhang.powermock.helloworld.domain.User;

/**
 * @author zhang yuyang
 * @ClassName: com.zhang.powermock.helloworld.reposity.UserDao
 * @Description: 用户dao层
 * @create 2018/05/03 13:50
 */
public class UserDao {

    public int getTotal(){
        throw new UnsupportedOperationException("not supported");
    }

    public void insertUser(User user){
        throw new UnsupportedOperationException("not supported");
    }
}
