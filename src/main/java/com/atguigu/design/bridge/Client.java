package com.atguigu.design.bridge;

/**
 * @Program:com.atguigu.design.bridge
 * @Author: mcrae.su
 * @Create: 2021-01-13 19:51
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1 = new Phone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println();
        System.out.println();
        System.out.println();

        Phone phone2 = new Phone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
