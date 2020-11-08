package com.atguigu.design.factory.abstractfactory.factory;

import com.atguigu.design.factory.abstractfactory.pizza.BJCheesePizza;
import com.atguigu.design.factory.abstractfactory.pizza.BJPepperPizza;
import com.atguigu.design.factory.common.pizza.Pizza;

/**
 * @author mcRae.su start
 * @create 2020-11-08 16:20
 * @description: 这是工厂子类
 */
public class BJFactory implements AbsFactoryInterface {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }else {
            System.out.println("北京目前该口味的Pizza暂未上架，敬请期待");
        }
        return pizza;
    }
}
