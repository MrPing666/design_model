package com.ping.model.strategy;

/**
 * @author Created by Mr.Ping on 2018/11/30.
 */
public class StrategyTest {

    public static void main(String[] args) {

        int type = 0;
        CashContext cashContext;
        do {
            cashContext = new CashContext(type);
            cashContext.getResult(400);
            type += 1;
        }while (type < 3);

    }
}
