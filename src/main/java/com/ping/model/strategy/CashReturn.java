package com.ping.model.strategy;

/**
 * 返现收费
 * @author Created by Mr.Ping on 2018/11/30.
 */
public class CashReturn extends CashSuper{

    private double moneyFull;
    private double moneyReturn;

    public CashReturn(double moneyFull, double moneyReturn) {
        this.moneyFull = moneyFull;
        this.moneyReturn = moneyReturn;
    }

    @Override
    double acceptCash(double money) {
        double result = money;
        if(money > moneyFull){
            result = money - moneyReturn;
            System.out.println("应收金额:" + money + ",满" + moneyFull + "减" + moneyReturn +",实收金额:" + result);
        }
        return result;
    }
}
