package com.ping.model.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Created by Mr.Ping on 2018/9/6.
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public Object getInstance(final Object object) {
        this.object = object;
        Class<?> clazz = object.getClass();
        System.out.println("被代理对象:" + clazz);
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("看房");
        Object invoke = method.invoke(this.object, args);
        System.out.println("房到手");
        return invoke;
    }
}
