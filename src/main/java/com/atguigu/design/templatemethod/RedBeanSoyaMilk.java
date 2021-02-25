package com.atguigu.design.templatemethod;

/**
 * @Program:com.atguigu.design.templatemethod
 * @Author: mcrae.su
 * @Create: 2021-02-25 16:25
 * @Description:
 */
public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入上好的红豆");
    }
}
