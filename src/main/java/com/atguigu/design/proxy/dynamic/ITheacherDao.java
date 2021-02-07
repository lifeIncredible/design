package com.atguigu.design.proxy.dynamic;

/**
 * @Program:com.atguigu.design.proxy.state
 * @Author: mcrae.su
 * @Create: 2021-02-07 15:56
 * @Description: 代理连接接口类--动态代理
 */
public interface ITheacherDao {
    /**
     * 授课
     */
    void teach();

    void sayHello(String name);
}
