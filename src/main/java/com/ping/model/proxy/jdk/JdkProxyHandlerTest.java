package com.ping.model.proxy.jdk;

import com.ping.model.proxy.cglib.BuyCar;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author Created by Mr.Ping on 2018/9/6.
 */
public class JdkProxyHandlerTest {

    public static void main(String[] args) {

        try {
            //jdk动态代理
            BuyHouse house = (BuyHouse) new DynamicProxyHandler().getInstance(new BuyHouseImpl());
            System.out.println("代理对象:" + house.getClass());
            house.buyHouse();

            //输出生成的代理对象
            byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{BuyCar.class});
            FileOutputStream os = new FileOutputStream("C:/Users/Administrator/Desktop/$Proxy0.class");
            os.write(data);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
