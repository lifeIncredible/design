package com.atguigu.design.principle.singleresponsibility;

/**
 * @Author 苏晓虎
 * @Description:
 * @create 2020-05-20 22:49
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        vehicle vehicle = new vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

//交通工具类
//方式1
//1.在方式1的run方法中，违反了单一职责原则
//2.解决的方案非常的简单，根据交通工具运行方法不同，分解成不同类即可
class  vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"    在公路上运行...");
    }
}