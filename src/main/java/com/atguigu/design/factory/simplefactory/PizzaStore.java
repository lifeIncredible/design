package com.atguigu.design.factory.simplefactory;

/**
 * @author mcRae.su start
 * @create 2020-11-08 15:19
 * @description:
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new Simplefactory());
    }
}
