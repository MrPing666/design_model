package com.ping.model.prototype;

/**
 * @author Created by Mr.Ping on 2018/12/10.
 */
public class CloneTest {

    public static void main(String[] args) {

        Book book = new Book("Chinese");
        Student s = new Student("Tom", 12, book);
        Student s1 = s.clone();

        System.out.println("浅克隆");
        System.out.println("s == s1---" + (s == s1));
        System.out.println("s.getClass() == s1.getClass()---" + (s.getClass() == s1.getClass()));
        System.out.println("s.getBook() == s1.getBook()---" + (s.getBook() == s1.getBook()));

        System.out.println("------------------------");

        try {
            Student s2 = s.deepClone();
            System.out.println("深克隆");
            System.out.println("s == s2---" + (s == s2));
            System.out.println("s.getClass() == s2.getClass()---" + (s.getClass() == s2.getClass()));
            System.out.println("s.getBook() == s2.getBook()---" + (s.getBook() == s2.getBook()));

            System.out.println("-------------------");
            System.out.println("s.age---" + s.getAge() + " s2.age---" + s2.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
