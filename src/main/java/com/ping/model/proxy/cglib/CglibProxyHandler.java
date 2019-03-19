package com.ping.model.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Created by Mr.Ping on 2018/9/6.
 */
public class CglibProxyHandler implements MethodInterceptor {

    public Object getInstance(Class clazz) {

        Enhancer en = new Enhancer();
        en.setSuperclass(clazz);
        en.setCallback(this);
        System.out.println("被代理对象:" + clazz);
        return en.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("试驾");
        methodProxy.invokeSuper(object, objects);
        System.out.println("车到手");
        return null;
    }
}
