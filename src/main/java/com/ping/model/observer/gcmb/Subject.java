package com.ping.model.observer.gcmb;

import com.ping.model.observer.gcz.Observer;

import java.util.ArrayList;

/**
 * @author Created by Mr.Ping on 2018/12/27.
 */
public abstract class Subject {

    protected ArrayList<Observer> observers = new ArrayList();

    /**
     * 订阅
     * @param observer
     */
    public void attach(Observer observer){
        System.out.println(observer.name + " 订阅了微信服务!");
        observers.add(observer);
    }

    /**
     * 取消订阅
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
        System.out.println(observer.name + " 取消了订阅!");
    }

    /**
     * 更新通知
     */
    abstract void notifyChange();
}
