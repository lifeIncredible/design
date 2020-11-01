package com.atguigu.design.factory.simplefactory.pizzastore.pizza;

/**
 * @author mcRae.su start
 * @create 2020-11-01 20:54
 * @description:
 */
public abstract class Pizza {

    protected String name;

    /**
     * 准备原材料,不同披萨原材料不一样，因此，我们做成抽象方法
     */
    public abstract void prepare();

    /**
     * 制作
     */
    public void bake(){
        System.out.println(name + "baking;");
    }

    /**
     * 切块
     */
    public void cut(){
        System.out.println(name +"cut;");
    }

    /**
     * 打包
     */
    public void box(){
        System.out.println(name +"box;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
