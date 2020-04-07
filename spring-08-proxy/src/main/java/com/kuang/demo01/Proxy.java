package com.kuang.demo01;

/**
 * @author 魏铭
 * @date 2020/4/2 - 11:55
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }
    //中介带你看房
    public void seeHouse() {
        System.out.println("看房");
    }
    //签合同
    public void hetong() {
        System.out.println("签合同");
    }
    //收中介费
    public void fare() {
        System.out.println("收中介费");
    }
}
