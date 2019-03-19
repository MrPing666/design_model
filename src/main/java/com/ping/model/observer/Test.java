package com.ping.model.observer;

import com.ping.model.observer.gcmb.WeChatServer;
import com.ping.model.observer.gcz.Observer;
import com.ping.model.observer.gcz.User;

public class Test {

    public static void main(String[] args) {

        WeChatServer server = new WeChatServer();

        Observer ding = new User("丁四");
        Observer chen = new User("陈五");
        Observer wang = new User("王六");
        System.out.println("---------------------");
        server.attach(ding);
        server.attach(chen);
        server.attach(wang);
        System.out.println("---------------------");
        server.messagePush("hello");
        System.out.println("---------------------");
        server.detach(ding);
        System.out.println("---------------------");
        server.messagePush("monkey");

    }

}
