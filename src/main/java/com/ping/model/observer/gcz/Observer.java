package com.ping.model.observer.gcz;

/**
 * 抽象观察者
 * @author Created by Mr.Ping on 2018/12/27.
 */
public abstract class Observer {

    /**名称**/
    public String name;

    /**
     * 更新
     * @param message
     */
    public abstract void update(String message);
}
