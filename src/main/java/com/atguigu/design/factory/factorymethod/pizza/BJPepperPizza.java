package com.atguigu.design.factory.factorymethod.pizza;

import com.atguigu.design.factory.common.pizza.Pizza;

/**
 * @author mcRae.su start
 * @create 2020-11-08 15:50
 * @description:
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println("北京的胡椒pizza，准备原材料");
    }
}
