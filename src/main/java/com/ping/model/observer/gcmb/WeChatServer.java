package com.ping.model.observer.gcmb;

import com.ping.model.observer.gcz.Observer;

import java.util.ArrayList;

/**
 * 被观察者
 * @author Created by Mr.Ping on 2018/12/27.
 */
public class WeChatServer extends Subject{

    private String message;

    @Override
    void notifyChange() {

        ArrayList<Observer> observers = super.observers;
        for(int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(message);
        }

    }

    public void messagePush(String message) {
        this.message = message;
        System.out.println("微信服务更新消息:" + message);
        //消息更新，通知所有观察者
        notifyChange();
    }
}
