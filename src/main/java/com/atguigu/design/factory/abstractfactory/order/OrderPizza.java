package com.atguigu.design.factory.abstractfactory.order;

import com.atguigu.design.factory.abstractfactory.factory.AbsFactoryInterface;
import com.atguigu.design.factory.common.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mcRae.su start
 * @create 2020-11-08 16:31
 * @description:
 */
public class OrderPizza {
    AbsFactoryInterface absFactoryInterface;

    public OrderPizza(AbsFactoryInterface absFactoryInterface) {
        setFactory(absFactoryInterface);
    }

    private void setFactory(AbsFactoryInterface absFactoryInterface){
        Pizza pizza = null;
        String orderType = "";//用户输入
        this.absFactoryInterface = absFactoryInterface;
        System.out.println("使用的是抽象工厂模式");
        do {
            orderType = getType();
            pizza = absFactoryInterface.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                continue;
            }
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
