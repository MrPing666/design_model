package com.ping.model.factory.abstrac;

/**
 * @author Created by Mr.Ping on 2018/9/20.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        DefultFactory factory = new DefultFactory();
        System.out.println(factory.getCar());

        System.out.println(factory.getCar("Benz"));
    }

}
