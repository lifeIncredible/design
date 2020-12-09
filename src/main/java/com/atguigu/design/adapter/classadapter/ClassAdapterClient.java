package com.atguigu.design.adapter.classadapter;

/**
 * @author mcRae.su start
 * @create 2020-12-09 23:41
 * @description:
 */
public class ClassAdapterClient {
    public static void main(String[] args) {
        System.out.println("====类适配器模式====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
