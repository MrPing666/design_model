package com.ping.model.factory.simple;

import com.ping.model.factory.Audi;
import com.ping.model.factory.Benz;
import com.ping.model.factory.Car;

/**
 * @author Created by Mr.Ping on 2018/9/20.
 */
public class SimpleFactory {

    public static Car getCar(String name){

        if("Audi".equalsIgnoreCase(name)){
            return new Audi();
        }else if("Benz".equalsIgnoreCase(name)){
            return new Benz();
        }else{
            return null;
        }
    }
}
