package com.atguigu.design.facade;

/**
 * @Program:com.atguigu.design.facade
 * @Author: mcrae.su
 * @Create: 2021-02-04 15:21
 * @Description: 爆米花
 */
public class Popcorn {
    private static  Popcorn instance = new Popcorn();

    private Popcorn() {

    }

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("popcorn on");
    }

    public void off() {
        System.out.println("popcorn off");
    }

    public void pop() {
        System.out.println("popcorn poping...");
    }
}
