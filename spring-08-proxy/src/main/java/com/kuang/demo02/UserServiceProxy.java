package com.kuang.demo02;

/**
 * @author 魏铭
 * @date 2020/4/2 - 12:47
 */
public class UserServiceProxy implements UserService {
    private UserServiceImpl userServiceImpl;

    public UserServiceProxy() {
    }

    public UserServiceProxy(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @Override
    public void add() {
        log("add");
        userServiceImpl.add();
    }

    @Override
    public void delete() {
        log("delete");
        userServiceImpl.delete();
    }

    public void log(String msg) {
        System.out.println("[debug]"+msg);
    }
}
