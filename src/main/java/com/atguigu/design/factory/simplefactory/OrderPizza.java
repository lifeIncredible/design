package com.atguigu.design.factory.simplefactory;

import com.atguigu.design.factory.common.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mcRae.su start
 * @create 2020-11-08 15:12
 * @description:
 */
public class OrderPizza {
    //定义一个简单工厂对象
    Simplefactory simplefactory;
    Pizza pizza = null;

    public OrderPizza(Simplefactory simplefactory){
        setFactory(simplefactory);
    }

    public void setFactory(Simplefactory simplefactory){
        String orderType = "";//用户输入
        this.simplefactory = simplefactory;
        do {
            orderType = getType();
            pizza = this.simplefactory.createPizza(orderType);
            if (this.pizza != null){
                this.pizza.prepare();
                this.pizza.bake();
                this.pizza.cut();
                this.pizza.box();
            }else {
                System.out.println("该种类披萨卖完了,请选择其他种类");
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
