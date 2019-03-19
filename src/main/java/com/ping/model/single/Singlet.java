package com.ping.model.single;

/**
 * @author Created by Mr.Ping on 2018/9/30.
 */
public class Singlet {

    //静态内部类  private保证外部不能修改  static保证全局唯一性
    private static class LazyHolder{

        public LazyHolder() {
            System.out.println("静态内部类构造方法被调用");
        }

        static {
            System.out.println("内部类静态块加载时间：" + System.currentTimeMillis());
        }

        //final防止内部误操作
        private static final Singlet INSTANCE = new Singlet();
    }

    //私有化构造方法
    private Singlet(){
        System.out.println("私有改造方法被调用");
    }


    public static final Singlet getInstance(){
        return LazyHolder.INSTANCE;
    }

    public static final void test(){
        System.out.println("test静态方法");
    }

    public static void main(String[] args) {
        Singlet.getInstance();
    }
}
