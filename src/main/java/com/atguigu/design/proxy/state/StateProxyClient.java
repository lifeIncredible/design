package com.atguigu.design.proxy.state;

/**
 * @Program:com.atguigu.design.proxy.state
 * @Author: mcrae.su
 * @Create: 2021-02-07 16:01
 * @Description:
 */
public class StateProxyClient {
    public static void main(String[] args) {
        //创建被代理对象
        TeacherDao teacherDao = new TeacherDao();

        //创建代理对象
        TeacherProxy teacherProxy = new TeacherProxy(teacherDao);

        //通过代理对象调用到被代理对象的执行方法
        teacherProxy.teach();
    }
}
