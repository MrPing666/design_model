package com.ping.model.factory.method;

/**
 * @author Created by Mr.Ping on 2018/9/20.
 */
public class MethodFactoryTest {

    public static void main(String[] args) {
        CarFactory factory = new AudiFactory();
        System.out.println(factory.getCar());

        factory = new BenzFactory();
        System.out.println(factory.getCar());
    }
}
