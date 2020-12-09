package com.atguigu.design.builder;

/**
 * @Author: 苏晓虎
 * @Create: 2020-12-09 15:40
 * @Description:
 */
public class HouseClient {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        //指挥者返回产品
        House house1 = houseDirector.constructHouse();

        System.out.println("输出流程");
        System.out.println("---------------");

        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);

        House house2 = houseDirector.constructHouse();

        //这不就是建造者模式
        StringBuilder hello = new StringBuilder("hello");
        System.out.println(hello);
    }
}
