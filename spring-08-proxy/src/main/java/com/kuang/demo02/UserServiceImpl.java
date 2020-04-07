package com.kuang.demo02;

/**
 * @author 魏铭
 * @date 2020/4/2 - 12:41
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("这是一个add方法");
    }

    @Override
    public void delete() {
        System.out.println("这是一个delete方法");
    }
}
