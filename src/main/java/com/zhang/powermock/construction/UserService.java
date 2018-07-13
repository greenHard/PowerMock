package com.zhang.powermock.construction;

/**
 * @author zhang yuyang
 * @ClassName: com.zhang.powermock.construction.UserService
 * @Description:
 * @create 2018/05/03 15:37
 */
public class UserService {

    public void insertUser(User user){
        UserDao userDao = new UserDao(false,Dialect.MYSQL);
        userDao.insertUser(user);
    }
}
