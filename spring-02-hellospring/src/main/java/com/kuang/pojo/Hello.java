package com.kuang.pojo;

/**
 * @author 魏铭
 * @date 2020/3/29 - 17:29
 */
public class Hello {
    private String str;

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
