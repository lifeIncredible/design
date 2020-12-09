package com.atguigu.design.adapter.objadapter;

/**
 * @author mcRae.su start
 * @create 2020-12-09 23:41
 * @description:
 */
public class ObjectAdapterClient {
    public static void main(String[] args) {
        System.out.println("====对象配器模式====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
