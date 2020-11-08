package com.atguigu.design.factory.simplefactory;

import com.atguigu.design.factory.common.pizza.CheesePizza;
import com.atguigu.design.factory.common.pizza.GreekPizz;
import com.atguigu.design.factory.common.pizza.PepperPizaa;
import com.atguigu.design.factory.common.pizza.Pizza;

/**
 * @author mcRae.su start
 * @create 2020-11-08 15:08
 * @description:
 */
public class Simplefactory {

    public Pizza createPizza(String orderType) {

        Pizza pizza = null;
        System.out.println("使用简单工厂模式");

        if (orderType.equals("greek")) {
            pizza = new GreekPizz();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
            //假如新增一个披萨，修改量过多，假设这只是全国一个店铺。若要新增一个种类的pizza，那么就要改动多个店铺
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizaa();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }


    public static Pizza createPizza2(String orderType) {

        Pizza pizza = null;
        System.out.println("使用简单工厂模式2");

        if (orderType.equals("greek")) {
            pizza = new GreekPizz();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
            //假如新增一个披萨，修改量过多，假设这只是全国一个店铺。若要新增一个种类的pizza，那么就要改动多个店铺
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizaa();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
