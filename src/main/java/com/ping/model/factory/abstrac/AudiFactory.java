package com.ping.model.factory.abstrac;

import com.ping.model.factory.Audi;
import com.ping.model.factory.Car;
import com.ping.model.factory.method.CarFactory;

/**
 * @author Created by Mr.Ping on 2018/9/20.
 */
public class AudiFactory extends AbstractFactory{


    @Override
    protected Car getCar() {
        return new Audi();
    }
}
