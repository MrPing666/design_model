package com.ping.model.template;

/**
 * @author Created by Mr.Ping on 2018/12/26.
 */
public abstract class Beverage {

    /**
     * 冲饮料
     */
    public void punchDrink(){

        boilWater();

        addMaterial();

        addWater();

        addAuxiliary();
    }

    /**
     * 烧水
     */
    public void boilWater(){
        System.out.println("烧开水");
    }

    /**
     * 加原料 喝咖啡还是茶 加啥？
     */
    public abstract void addMaterial();

    /**
     * 加水冲泡
     */
    public void addWater(){
        System.out.println("倒入开水冲泡");
    }

    /**
     * 加辅料 咖啡加牛奶  茶加蜂蜜  加啥？
     */
    public abstract void addAuxiliary();
}
