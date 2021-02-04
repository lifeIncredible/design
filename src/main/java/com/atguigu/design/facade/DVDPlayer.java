package com.atguigu.design.facade;

/**
 * @Program:com.atguigu.design.facade
 * @Author: mcrae.su
 * @Create: 2021-02-04 15:12
 * @Description: DVD播放器----通过类加载器提前实例化当前对象，避免线程问题。但有些资源浪费
 */
public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer() {

    }

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("dvd on");
    }

    public void off() {
        System.out.println("dvd off");
    }

    public void player() {
        System.out.println("dvd is playing");
    }

    public void pause(){
        System.out.println("dva pause..");
    }
}
