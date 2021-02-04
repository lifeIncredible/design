package com.atguigu.design.facade;

/**
 * @Program:com.atguigu.design.facade
 * @Author: mcrae.su
 * @Create: 2021-02-04 15:19
 * @Description: 家庭影院--对外暴露
 */
public class HomeTheaterFacade {

    /**
     * 播放器
     */
    private DVDPlayer dvdPlayer;
    /**
     * 爆米花
     */
    private Popcorn popcorn;
    /**
     * 投影仪
     */
    private Projector projector;
    /**
     * 屏幕
     */
    private Screen screen;
    /**
     * 立体声
     */
    private Stereo stereo;
    /**
     * 灯光效果
     */
    private TheaterLight theaterLight;


    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    public void ready(){
        dvdPlayer.on();
        popcorn.on();
        projector.on();
        screen.up();
        stereo.on();
        theaterLight.on();
        System.out.println("---准备就绪---");
    }

    public void play(){
        dvdPlayer.player();
        System.out.println("---开始---");
    }

    public void pause(){
        dvdPlayer.pause();
        System.out.println("---暂停---");
    }

    public void end(){
        dvdPlayer.off();
        popcorn.off();
        screen.down();
        stereo.off();
        theaterLight.off();
        System.out.println("--设备关闭--");
    }
}
