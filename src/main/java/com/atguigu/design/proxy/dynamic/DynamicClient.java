package com.atguigu.design.proxy.dynamic;

import javax.crypto.spec.IvParameterSpec;

/**
 * @Program:com.atguigu.design.proxy.dynamic
 * @Author: mcrae.su
 * @Create: 2021-02-07 16:30
 * @Description:
 */
public class DynamicClient {
    public static void main(String[] args) {
        //1. 生成被代理对象
        TeacherDao target = new TeacherDao();
        //2. 将被代理对象聚合进代理工厂
        ProxyFactory proxyFactory = new ProxyFactory(target);
        //3. 从代理工厂获取到代理对象
        ITheacherDao proxyInstance = (ITheacherDao)proxyFactory.getProxyInstance();
        //代理对象内存中的位置：class com.sun.proxy.$Proxy0
        System.out.println("proxyInstance="+proxyInstance.getClass());

        //4. 通过代理对象执行目标方法
        proxyInstance.teach();
        proxyInstance.sayHello("mcRae");
    }
}
