package com.atguigu.design.factory.simplefactory.pizzastore.order;

import com.atguigu.design.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.design.factory.simplefactory.pizzastore.pizza.GreekPizz;
import com.atguigu.design.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mcRae.su start
 * @create 2020-11-01 21:02
 * @description:
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //订购披萨的类型
        do {
            orderType = getType(); //要订购披萨的种类
            if (orderType.equals("greek")){
                pizza = new GreekPizz();
                pizza.setName("希腊披萨");
            }else if (orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    private String getType(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type:");
        String str = null;
        try {
            str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
