package com.ping.model.delegate;

/**
 * @author Created by Mr.Ping on 2018/10/20.
 */
public class Delegates implements TaskAllot{

    TaskAllot taskAllot;

    public Delegates(TaskAllot taskAllot){
        this.taskAllot = taskAllot;
    }

    @Override
    public void modularAllot(String modular){
        taskAllot.modularAllot(modular);
    }
}
