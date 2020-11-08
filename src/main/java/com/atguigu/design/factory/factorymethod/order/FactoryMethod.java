package com.atguigu.design.factory.factorymethod.order;

import com.atguigu.design.factory.common.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author mcRae.su start
 * @create 2020-11-08 15:12
 * @description:
 */
public abstract class FactoryMethod {
    Pizza pizza = null;
    String orderType;  //披萨订购的类型


    public FactoryMethod(){
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            if (pizza == null){
                System.out.println("目前该口味的Pizza还未上架，敬请期待");
                continue;
            }
            this.pizza.prepare();
            this.pizza.bake();
            this.pizza.cut();
            this.pizza.box();
        }while (true);
    }

    public abstract Pizza createPizza(String orderType);

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
