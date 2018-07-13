package com.zhang.powermock.verify;

/**
 * @author zhang yuyang
 * @ClassName: com.zhang.powermock.verify.UserService
 * @Description:
 * @create 2018/05/03 15:24
 */
public class UserService {

    public void saveOrUpdate(User user) {
        UserDao userDao = new UserDao();
        if (userDao.getCount(user) > 0) {
            userDao.updateUser(user);
        } else {
            userDao.insertUser(user);
        }
    }
}
