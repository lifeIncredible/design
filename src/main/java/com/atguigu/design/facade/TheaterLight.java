package com.atguigu.design.facade;

/**
 * @Program:com.atguigu.design.facade
 * @Author: mcrae.su
 * @Create: 2021-02-04 15:44
 * @Description: 灯光效果
 */
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    private TheaterLight(){

    }

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off(){
        System.out.println("TheaterLight off");
    }

    public void dim(){
        System.out.println("TheaterLight is dim");
    }

    public void bright(){
        System.out.println("TheaterLight is bright");
    }
}
