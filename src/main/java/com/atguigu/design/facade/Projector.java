package com.atguigu.design.facade;

/**
 * @Program:com.atguigu.design.facade
 * @Author: mcrae.su
 * @Create: 2021-02-04 15:29
 * @Description: 投影仪
 */
public class Projector {
    private static Projector instance = new Projector();

    private Projector(){

    }

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("projector on");
    }

    public void off() {
        System.out.println("projector off");
    }

    public void focus() {
        System.out.println("projector is projector");
    }
}
