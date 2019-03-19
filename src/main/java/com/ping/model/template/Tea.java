package com.ping.model.template;

/**
 * @author Created by Mr.Ping on 2018/12/26.
 */
public class Tea extends Beverage {
    @Override
    public void addMaterial() {
        System.out.println("放入茶叶");
    }

    @Override
    public void addAuxiliary() {
        System.out.println("加蜂蜜");
    }
}
