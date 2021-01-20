package com.atguigu.design.decorator;

/**
 * @author SXH
 * @create 2021-01-16 15:48
 * @description: 装饰者类（调料类）
 */
//体现继承关系
public class Decorator extends Drink{

    private Drink obj;

    //体现组合关系
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return getPrice() + obj.getPrice();
    }

    @Override
    public String getDes() {
        //obj.getDes() 输出被装饰者的信息
        return des +" "+ getPrice() + " && " + obj.getDes();
    }
}
