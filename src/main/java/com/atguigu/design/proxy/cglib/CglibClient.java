package com.atguigu.design.proxy.cglib;

/**
 * @Program:com.atguigu.design.proxy.cglib
 * @Author: mcrae.su
 * @Create: 2021-02-20 15:11
 * @Description:
 */
public class CglibClient {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        TeacherDao proxyInstance = (TeacherDao)proxyFactory.getProxyInstance();
        String returnVal = proxyInstance.teach();
        System.out.println("res ="+ returnVal);
    }
}
