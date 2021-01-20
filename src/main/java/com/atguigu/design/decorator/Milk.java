package com.atguigu.design.decorator;

/**
 * @author SXH
 * @create 2021-01-16 15:57
 * @description: 调味品 牛奶
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setPrice(2.0f);
        setDes("牛奶");

    }
}
