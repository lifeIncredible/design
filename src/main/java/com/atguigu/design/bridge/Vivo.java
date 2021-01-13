package com.atguigu.design.bridge;

/**
 * @Program:com.atguigu.design.bridge
 * @Author: mcrae.su
 * @Create: 2021-01-13 19:41
 * @Description:
 */
public class Vivo implements  Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }
}
