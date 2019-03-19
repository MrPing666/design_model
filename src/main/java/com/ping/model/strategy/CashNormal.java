package com.ping.model.strategy;

/**
 * 正常收费
 * @author Created by Mr.Ping on 2018/11/30.
 */
public class CashNormal extends CashSuper{
    @Override
    double acceptCash(double money) {
        System.out.println("应收金额:" + money + ",实收金额:" + money);
        return money;
    }
}
