package com.atguigu.design.decorator;

/**
 * @author SXH
 * @create 2021-01-16 15:41
 * @description: 第二等级缓存层
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
