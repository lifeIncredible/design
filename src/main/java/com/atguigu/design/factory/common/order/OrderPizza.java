package com.atguigu.design.factory.common.order;

import com.atguigu.design.factory.common.pizza.PepperPizaa;
import com.atguigu.design.factory.common.pizza.CheesePizza;
import com.atguigu.design.factory.common.pizza.GreekPizz;
import com.atguigu.design.factory.common.pizza.Pizza;

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
                //假如新增一个披萨，修改量过多，假设这只是全国一个店铺。若要新增一个种类的pizza，那么就要改动多个店铺
            }else if (orderType.equals("pepper")){
                pizza = new PepperPizaa();
                pizza.setName("胡椒披萨");
            } else {
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
