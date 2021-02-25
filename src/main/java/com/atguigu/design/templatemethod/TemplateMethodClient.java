package com.atguigu.design.templatemethod;

/**
 * @Program:com.atguigu.design.templatemethod
 * @Author: mcrae.su
 * @Create: 2021-02-25 16:27
 * @Description:
 */
public class TemplateMethodClient {
    public static void main(String[] args) {
        System.out.println("--制作红豆豆浆--");
        new RedBeanSoyaMilk().make();
        System.out.println("--制作花生豆浆--");
        new Peanut().make();
    }
}
