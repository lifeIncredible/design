package com.atguigu.design.factory.common.pizza;

/**
 * @author mcRae.su start
 * @create 2020-11-01 21:00
 * @description:
 */
public class CheesePizza extends  Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }
}
