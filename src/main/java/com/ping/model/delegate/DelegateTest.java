package com.ping.model.delegate;

/**
 * @author Created by Mr.Ping on 2018/10/20.
 */
public class DelegateTest {
    public static void main(String[] args) {
        StaffWang staffWang = new StaffWang();
        StaffChen staffChen = new StaffChen();

        Delegates delegate = new Delegates(staffWang);
        delegate.modularAllot("订单");

        delegate = new Delegates(staffChen);
        delegate.modularAllot("支付");

    }
}
