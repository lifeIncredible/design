package com.atguigu.design.factory.common.pizza;

/**
 * @author mcRae.su start
 * @create 2020-11-08 14:53
 * @description:
 */
public class PepperPizaa extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料");
    }
}
