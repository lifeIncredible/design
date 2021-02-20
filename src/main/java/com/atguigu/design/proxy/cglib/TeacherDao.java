package com.atguigu.design.proxy.cglib;

/**
 * @Program:com.atguigu.design.proxy.cglib
 * @Author: mcrae.su
 * @Create: 2021-02-20 15:00
 * @Description: 被代理对象
 */
public class TeacherDao {
    public String teach(){
        System.out.println("老师授课中,  我是Cglib代理，不需要实现接口");
        return "hello";
    }
}
