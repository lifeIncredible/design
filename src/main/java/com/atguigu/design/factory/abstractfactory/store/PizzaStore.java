package com.atguigu.design.factory.abstractfactory.store;

import com.atguigu.design.factory.abstractfactory.factory.BJFactory;
import com.atguigu.design.factory.abstractfactory.order.OrderPizza;

/**
 * @author mcRae.su start
 * @create 2020-11-08 16:38
 * @description:
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
