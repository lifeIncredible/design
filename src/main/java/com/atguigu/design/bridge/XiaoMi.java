package com.atguigu.design.bridge;

/**
 * @Program:com.atguigu.design.bridge
 * @Author: mcrae.su
 * @Create: 2021-01-13 19:40
 * @Description:
 */
public class XiaoMi implements  Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
