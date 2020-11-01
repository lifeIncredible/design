package com.atguigu.design.principle.singleresponsibility;

/**
 * @Author 苏晓虎
 * @Description:
 * @create 2020-05-20 22:56
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        roadVehicle.run("摩托车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}


//方案2
//1.    遵守了单一职责原则
//2.    但是这样做的改动很大，即将类分级，同时修改客户端
//3.    改进：直接修改Vehicle类，改动的代码会比较少=》方案3
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "公路运行");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "天空运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "水中运行");
    }
}