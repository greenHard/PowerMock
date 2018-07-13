package com.zhang.powermock.construction;

/**
 * @author zhang yuyang
 * @ClassName: com.zhang.powermock.construction.UserDao
 * @Description:
 * @create 2018/05/03 15:39
 */
public class UserDao {

    public UserDao(boolean lazy,Dialect dialect) {
        throw new UnsupportedOperationException();
    }

    public void insertUser(User usr){
        throw new UnsupportedOperationException();
    }
}

enum Dialect {
    MYSQL,
    ORACLE
}
