package com.atguigu.design.factory.abstractfactory.pizza;

import com.atguigu.design.factory.common.pizza.Pizza;

/**
 * @author mcRae.su start
 * @create 2020-11-08 15:52
 * @description:
 */
public class LondonPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println("伦敦的胡椒pizza，准备原材料");
    }
}
