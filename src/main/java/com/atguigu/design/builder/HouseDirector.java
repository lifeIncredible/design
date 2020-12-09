package com.atguigu.design.builder;

/**
 * @Author: 苏晓虎
 * @Create: 2020-12-09 15:21
 * @Description: 建造者模式中的指挥者角色
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    /**
     * 构造器传入
     * @param houseBuilder
     */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }



    /**
     * setter方法传入
     * @param houseBuilder
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
