package com.kuang.dao;

/**
 * @author 魏铭
 * @date 2020/3/29 - 16:38
 */
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据");
    }
}
