package com.atguigu.design.decorator;

/**
 * @author SXH
 * @create 2021-01-16 16:01
 * @description: 咖啡馆类
 */
public class CoffeeShop {

    public static void main(String[] args) {
        // 装饰者模式下的订单： 2份巧克力+1份牛奶的澳式黑咖啡

        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("order费用="+"\t"+ order.cost());
        System.out.println("order描述="+"\t"+ order.getDes());

        //2.order 加一份牛奶
        order = new Milk(order);
        System.out.println("order加入一份牛奶的费用="+"\t"+ order.cost());
        System.out.println("order加入一份牛奶的描述="+"\t"+ order.getDes());


        //3.order再加一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶又加入一份巧克力费用="+"\t"+ order.cost());
        System.out.println("order加入一份牛奶又加入一份巧克力描述="+"\t"+ order.getDes());


        //4.order再加一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入1份牛奶加入2份巧克力费用="+"\t"+ order.cost());
        System.out.println("order加入1份牛奶加入2份巧克力描述="+"\t"+ order.getDes());

        System.out.println("===================================");

        Drink order2 = new DeCaf();
        System.out.println("order2咖啡费用="+"\t"+order2.cost());
        System.out.println("order2咖啡描述="+"\t"+order2.getDes());

        order2 = new Milk(order2);
        System.out.println("order2咖啡加一份牛奶费用="+"\t"+ order2.cost());
        System.out.println("order2咖啡加一份牛奶描述="+"\t"+ order2.getDes());
    }
}
