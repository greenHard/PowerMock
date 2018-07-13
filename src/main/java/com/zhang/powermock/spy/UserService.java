package com.zhang.powermock.spy;

import java.util.Optional;

/**
 * @author zhang yuyang
 * @ClassName: com.zhang.powermock.spy.UserService
 * @Description:
 * @create 2018/05/03 17:12
 */
public class UserService {

    public void write() {
        log();
    }

    public void log() {
        Optional.of("console a log ").ifPresent(System.out::println);
    }

}
