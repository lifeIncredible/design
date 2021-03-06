package com.atguigu.design.proxy.dynamic;

import com.atguigu.design.proxy.dynamic.ITheacherDao;

/**
 * @Program:com.atguigu.design.proxy.state
 * @Author: mcrae.su
 * @Create: 2021-02-07 15:57
 * @Description: 被代理对象
 */
public class TeacherDao implements ITheacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello" + name);
    }
}
