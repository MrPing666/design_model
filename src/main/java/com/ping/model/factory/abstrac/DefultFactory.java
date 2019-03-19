package com.ping.model.factory.abstrac;

import com.ping.model.factory.Car;

/**
 * @author Created by Mr.Ping on 2018/9/20.
 */
public class DefultFactory extends AbstractFactory {
    @Override
    protected Car getCar() {
        return new AudiFactory().getCar();
    }
}
