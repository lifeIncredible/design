package com.atguigu.design.factory.abstractfactory.factory;

import com.atguigu.design.factory.abstractfactory.pizza.BJCheesePizza;
import com.atguigu.design.factory.abstractfactory.pizza.BJPepperPizza;
import com.atguigu.design.factory.abstractfactory.pizza.LondonCheesePizza;
import com.atguigu.design.factory.abstractfactory.pizza.LondonPepperPizza;
import com.atguigu.design.factory.common.pizza.Pizza;

/**
 * @author mcRae.su start
 * @create 2020-11-08 16:20
 * @description:
 */
public class LondonFactory implements AbsFactoryInterface {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LondonCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LondonPepperPizza();
        }else {
            System.out.println("伦敦目前该口味的Pizza暂未上架，敬请期待");
        }
        return pizza;
    }
}
