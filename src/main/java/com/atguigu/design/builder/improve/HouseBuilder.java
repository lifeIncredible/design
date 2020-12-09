package com.atguigu.design.builder.improve;

/**
 * @Author: 苏晓虎
 * @Create: 2020-12-09 15:15
 * @Description: 抽象的建造者
 */
public abstract class HouseBuilder {
    protected House house = new House();

    /**
     * 抽象的建造地基方法
     */
    public abstract void buildBasic();

    /**
     * 抽象的建造墙壁方法
     */
    public abstract void buildWalls();

    /**
     * 抽象的建造房屋封顶方法
     */
    public abstract void roofed();

    /**
     * 将房子建造好，(产品)返回
     * @return
     */
    public House buildHouse(){
        return house;
    }
}
