package com.atguigu.design.factory.factorymethod.order;

import com.atguigu.design.factory.common.pizza.Pizza;
import com.atguigu.design.factory.factorymethod.pizza.LondonCheesePizza;
import com.atguigu.design.factory.factorymethod.pizza.LondonPepperPizza;

/**
 * @author mcRae.su start
 * @create 2020-11-08 16:01
 * @description:
 */
public class LondonPizzaFactory extends FactoryMethod {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LondonCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LondonPepperPizza();
        }
        return pizza;
    }
}
