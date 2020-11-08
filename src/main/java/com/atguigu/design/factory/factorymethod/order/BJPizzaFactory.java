package com.atguigu.design.factory.factorymethod.order;

import com.atguigu.design.factory.common.pizza.Pizza;
import com.atguigu.design.factory.factorymethod.pizza.BJCheesePizza;
import com.atguigu.design.factory.factorymethod.pizza.BJPepperPizza;

/**
 * @author mcRae.su start
 * @create 2020-11-08 16:01
 * @description:
 */
public class BJPizzaFactory extends FactoryMethod {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
