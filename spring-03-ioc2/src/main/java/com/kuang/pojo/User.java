package com.kuang.pojo;

/**
 * @author 魏铭
 * @date 2020/3/29 - 19:09
 */
public class User {
    private String name;

    public User(String name){
//        System.out.println("User的无参构造");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println("name=" + name);
    }
}
