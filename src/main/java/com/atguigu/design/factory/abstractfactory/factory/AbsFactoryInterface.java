package com.atguigu.design.factory.abstractfactory.factory;

import com.atguigu.design.factory.common.pizza.Pizza;

/**
 * @author mcRae.su start
 * @create 2020-11-08 16:18
 * @description: 抽象工厂模式的抽象层
 */
public interface AbsFactoryInterface {

    Pizza createPizza(String orderType);
}
