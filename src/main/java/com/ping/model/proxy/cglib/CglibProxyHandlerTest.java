package com.ping.model.proxy.cglib;

/**
 * @author Created by Mr.Ping on 2018/9/6.
 */
public class CglibProxyHandlerTest {

    public static void main(String[] args) {
        //CGLIB代理
        BuyCar car = (BuyCar) new CglibProxyHandler().getInstance(BuyCar.class);
        System.out.println("代理对象:" + car.getClass());
        car.buyCar();
    }
}
