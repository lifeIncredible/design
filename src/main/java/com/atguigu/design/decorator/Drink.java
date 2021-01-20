package com.atguigu.design.decorator;

/**
 * @author mcRae.su start
 * @create 2021-01-16 15:38
 * @description: 最高等级抽象类
 */
public abstract class Drink {

    /**
     * 描述
     */
    public String des;

    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的抽象方法
    //子类来实现
    public abstract float cost();
}
