package com.ping.model.strategy;

/**
 * 折扣收费
 * @author Created by Mr.Ping on 2018/11/30.
 */
public class CashRebate extends CashSuper{

    private double rebate;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    double acceptCash(double money) {
        System.out.println("应收金额:" + money + ",折率:" + rebate +",实收金额:" + money * rebate);
        return money * rebate;
    }
}
