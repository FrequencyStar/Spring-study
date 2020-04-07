package com.kuang.demo01;

/**
 * @author 魏铭
 * @date 2020/4/2 - 11:55
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
