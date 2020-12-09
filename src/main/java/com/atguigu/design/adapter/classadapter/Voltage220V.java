package com.atguigu.design.adapter.classadapter;

/**
 * @author mcRae.su start
 * @create 2020-12-09 23:33
 * @description: 被适配的类
 */
public class Voltage220V {

    public int output220V(){
        int src = 220;
        System.out.println("初始电压=" + src + "伏");
        return src;
    }
}
