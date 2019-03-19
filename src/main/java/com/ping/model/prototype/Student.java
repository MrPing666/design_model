package com.ping.model.prototype;

import java.io.*;

/**
 * @author Created by Mr.Ping on 2018/12/10.
 */
public class Student implements Cloneable, Serializable {

    private String name;

    private transient int age;

    private Book book;

    public Student() {
    }

    public Student(String name, int age, Book book) {
        this.name = name;
        this.age = age;
        this.book = book;
    }

    //浅克隆
    public Student clone(){
        Student stu = null;
        try {
            stu = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return stu;
    }

    //深克隆
    public Student deepClone(){

        Student stu = null;
        ByteArrayOutputStream bo = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bi = null;
        ObjectInputStream oi = null;
        try {
            //序列化
            bo = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bo);
            oos.writeObject(this);

            //反序列化
            bi = new ByteArrayInputStream(bo.toByteArray());
            oi = new ObjectInputStream(bi);
            stu = (Student) oi.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bo.close();
                oos.close();
                bi.close();
                oi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stu;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Book getBook() {
        return book;
    }
}
