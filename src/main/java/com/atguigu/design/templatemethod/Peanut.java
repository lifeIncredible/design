package com.atguigu.design.templatemethod;

/**
 * @Program:com.atguigu.design.templatemethod
 * @Author: mcrae.su
 * @Create: 2021-02-25 16:26
 * @Description:
 */
public class Peanut extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入珍贵的花生");
    }
}
