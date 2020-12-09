package com.atguigu.design.builder.improve;

/**
 * @Author: 苏晓虎
 * @Create: 2020-12-09 15:30
 * @Description:
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙50米");
    }

    @Override
    public void roofed() {
        System.out.println("高楼的星空楼顶");
    }
}
