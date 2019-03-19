package com.ping.model.template;

/**
 * @author Created by Mr.Ping on 2018/12/26.
 */
public class Coffee extends Beverage{

    @Override
    public void addMaterial() {
        System.out.println("放入咖啡粉");
    }

    @Override
    public void addAuxiliary() {
        System.out.println("加牛奶和糖");
    }
}
