package com.atguigu.design.factory.common.order;

/**
 * @author mcRae.su start
 * @create 2020-11-01 21:15
 * @description:
 */
public class PizzClient {
    public static void main(String[] args) {
        new OrderPizza();
    }

    /**
     * 这种传统的方式的优缺点：
     *  优点是比较好理解，简单易操作。
     *  缺点就是违反了设计模式的OCP原则，即对扩展开放，对修改关闭。即我们给类增加新功能时，尽量不要修改代码或者尽量少修改代码。
     */
}
