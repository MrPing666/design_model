package com.ping.model.delegate;

/**
 * @author Created by Mr.Ping on 2018/10/20.
 */
public class StaffChen implements TaskAllot{
    @Override
    public void modularAllot(String modular) {
        System.out.println("Chen:" + modular);
    }
}
