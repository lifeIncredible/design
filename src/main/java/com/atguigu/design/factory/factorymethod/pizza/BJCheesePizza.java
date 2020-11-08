package com.atguigu.design.factory.factorymethod.pizza;

import com.atguigu.design.factory.common.pizza.Pizza;

/**
 * @author mcRae.su start
 * @create 2020-11-08 15:49
 * @description:  北京奶酪披萨
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的奶酪披萨");
        System.out.println("北京的奶酪披萨，准备原材料");
    }
}
