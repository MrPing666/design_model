package com.ping.model.template;

/**
 * @author Created by Mr.Ping on 2018/12/26.
 */
public class TemplateTest {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.punchDrink();
        System.out.println("---------");
        Coffee coffee = new Coffee();
        coffee.punchDrink();
    }
}
