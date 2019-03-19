package com.ping.model.factory.simple;

import com.ping.model.factory.Car;

/**
 * @author Created by Mr.Ping on 2018/9/20.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Car benz = SimpleFactory.getCar("Benz");
        System.out.println(benz.getCarName());
    }
}
