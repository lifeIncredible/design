package com.atguigu.design.builder;

/**
 * @author mcRae.su start
 * @create 2020-12-07 23:41
 * @description:
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();


    public void build(){

        buildBasic();
        buildWalls();
        roofed();
    }
}
