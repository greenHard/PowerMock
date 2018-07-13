package com.zhang.powermock.mockprivate;

/**
 * @author zhang yuyang
 * @ClassName: com.zhang.powermock.mockprivate.UserService
 * @Description:
 * @create 2018/05/03 17:18
 */
public class UserService {

    public boolean exist(String userName) {
        checkExist(userName);
        return true;
    }

    private void checkExist(String userName) {
        throw new UnsupportedOperationException();
    }
}
