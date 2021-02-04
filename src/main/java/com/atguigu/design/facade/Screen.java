package com.atguigu.design.facade;

/**
 * @Program:com.atguigu.design.facade
 * @Author: mcrae.su
 * @Create: 2021-02-04 15:32
 * @Description: 屏幕
 */
public class Screen {
    private static Screen instance = new Screen();

    private Screen(){
    }

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("Screen up");
    }

    public void down(){
        System.out.println("Screen down");
    }
}
