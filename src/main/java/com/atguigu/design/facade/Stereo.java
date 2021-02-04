package com.atguigu.design.facade;

/**
 * @Program:com.atguigu.design.facade
 * @Author: mcrae.su
 * @Create: 2021-02-04 15:35
 * @Description: 立体声
 */
public class Stereo {
    private static Stereo instance = new Stereo();

    private Stereo(){

    }

    public static Stereo getInstance(){
        return instance;
    }
    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void up(){
        System.out.println("Stereo up");
    }
}
