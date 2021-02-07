package com.atguigu.design.flyweight.jdksource;

/**
 * @Program:com.atguigu.design.flyweight.jdksource
 * @Author: mcrae.su
 * @Create: 2021-02-07 15:06
 * @Description: 用于讲解享元模式在jdk源码的应用
 */
public class FlyWeight {
    public static void main(String[] args) {
        Integer.valueOf(1);
        /*
         当调用Integer.valueOf()方法时，数据再-128到127就直接使用享元模式的缓冲池中的数据,否则就使用重新生成对象。
         valueOf方法得到一个Integer实例，范围在-128-127，执行速度比new快。
         public static Integer valueOf(int i) {
            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
            return new Integer(i);
        }*/
    }
}
