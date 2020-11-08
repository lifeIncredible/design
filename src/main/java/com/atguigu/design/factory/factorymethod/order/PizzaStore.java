package com.atguigu.design.factory.factorymethod.order;

/**
 * @author mcRae.su start
 * @create 2020-11-08 16:06
 * @description:
 */
public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味的各种Pizza
        //new BJPizzaFactory();
        //创建伦敦口味的各种Pizza
        new LondonPizzaFactory();
    }
}
