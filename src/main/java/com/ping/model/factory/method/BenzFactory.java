package com.ping.model.factory.method;

import com.ping.model.factory.Benz;
import com.ping.model.factory.Car;

/**
 * @author Created by Mr.Ping on 2018/9/20.
 */
public class BenzFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Benz();
    }
}
