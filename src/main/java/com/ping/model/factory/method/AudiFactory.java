package com.ping.model.factory.method;

import com.ping.model.factory.Audi;
import com.ping.model.factory.Car;

/**
 * @author Created by Mr.Ping on 2018/9/20.
 */
public class AudiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Audi();
    }
}
