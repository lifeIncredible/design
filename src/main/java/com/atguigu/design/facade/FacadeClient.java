package com.atguigu.design.facade;

/**
 * @Program:com.atguigu.design.facade.theory
 * @Author: mcrae.su
 * @Create: 2021-02-04 15:08
 * @Description: 无趣的外观模式
 */
public class FacadeClient {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
