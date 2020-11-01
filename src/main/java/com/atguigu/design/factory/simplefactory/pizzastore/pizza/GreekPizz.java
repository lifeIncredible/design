package com.atguigu.design.factory.simplefactory.pizzastore.pizza;

/**
 * @author mcRae.su start
 * @create 2020-11-01 21:01
 * @description:
 */
public class GreekPizz extends  Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
