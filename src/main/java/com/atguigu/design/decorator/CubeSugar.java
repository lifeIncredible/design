package com.atguigu.design.decorator;

/**
 * @author SXH
 * @create 2021-01-16 15:58
 * @description: 调味品 方糖
 */
public class CubeSugar extends Decorator {

    public CubeSugar(Drink obj) {
        super(obj);
        setDes("方糖");
        setPrice(1.5f);
    }
}
