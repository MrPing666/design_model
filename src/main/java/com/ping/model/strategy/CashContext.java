package com.ping.model.strategy;

/**
 * 策略上下文
 * @author Created by Mr.Ping on 2018/11/30.
 */
public class CashContext {

    private CashSuper cs = null;

    //type为收费类型 0正常收费 1打折  2满减
    public CashContext(int type) {

        switch (type){
            case 0:
                cs = new CashNormal();
                break;
            case 1:
                cs = new CashRebate(0.8);
                break;
            case 2:
                cs = new CashReturn(300, 100);
                break;
        }
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
