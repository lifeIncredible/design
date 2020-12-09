package com.atguigu.design.builder.improve;

/**
 * @Author: 苏晓虎
 * @Create: 2020-12-09 15:28
 * @Description:
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙3米");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
