package com.kuang.demo03;

import java.security.PrivateKey;

/**
 * @author 魏铭
 * @date 2020/4/4 - 14:19
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
