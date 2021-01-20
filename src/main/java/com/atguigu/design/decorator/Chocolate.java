package com.atguigu.design.decorator;

/**
 * @author SXH
 * @create 2021-01-16 15:56
 * @description: 巧克力
 */
public class Chocolate extends Decorator{


    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        //当前调味品的价格
        setPrice(3.0f);
    }
}
