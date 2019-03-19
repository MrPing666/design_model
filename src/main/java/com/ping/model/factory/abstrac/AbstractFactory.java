package com.ping.model.factory.abstrac;

import com.ping.model.factory.Car;

/**
 * @author Created by Mr.Ping on 2018/9/20.
 */
public abstract class AbstractFactory {

    protected abstract Car getCar();

    public Car getCar(String carName){

        if("Audi".equalsIgnoreCase(carName)){
            return new AudiFactory().getCar();
        }else if("Benz".equalsIgnoreCase(carName)){
            return new BenzFactory().getCar();
        }else{
            return null;
        }
    }
}
