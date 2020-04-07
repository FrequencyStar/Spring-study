package com.kuang.dao;

/**
 * @author 魏铭
 * @date 2020/3/29 - 18:31
 */
public class UserDaoSQLServer implements UserDao {
    @Override
    public void getUser() {
        System.out.println("SQLServer默认调用");
    }
}
