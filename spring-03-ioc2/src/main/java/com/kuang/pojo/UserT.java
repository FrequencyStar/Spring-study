package com.kuang.pojo;

/**
 * @author 魏铭
 * @date 2020/3/29 - 19:59
 */
public class UserT {
    public String name;

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
