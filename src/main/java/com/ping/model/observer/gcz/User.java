package com.ping.model.observer.gcz;

/**
 * 具体观察者
 * @author Created by Mr.Ping on 2018/12/27.
 */
public class User extends Observer{

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " 收到消息:" + message);
    }

}
