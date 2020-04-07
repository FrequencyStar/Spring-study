package com.kuang.demo02;

/**
 * @author 魏铭
 * @date 2020/4/2 - 12:42
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        userServiceProxy.add();
    }
}
