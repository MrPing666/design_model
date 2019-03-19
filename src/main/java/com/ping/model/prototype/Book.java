package com.ping.model.prototype;

import java.io.Serializable;

/**
 * @author Created by Mr.Ping on 2018/12/10.
 */
public class Book implements Serializable {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
