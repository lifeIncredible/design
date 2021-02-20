package com.atguigu.design.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Program:com.atguigu.design.proxy.cglib
 * @Author: mcrae.su
 * @Create: 2021-02-20 15:03
 * @Description:
 */
public class ProxyFactory implements MethodInterceptor {

    /**
     * 维护一个对象
     */
    private Object target;

    /**
     * 构造器传入目标对象
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }


    /**
     * 返回一个代理对象，是成员变量target的代理对象
     * @return
     */
    public Object getProxyInstance(){
        // 1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类
        enhancer.setSuperclass(target.getClass());
        // 3.设置回调函数
        enhancer.setCallback(this);
        // 4.创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * 重写intercept方法，会调用目标对象的方法
     * @param obj
     * @param method
     * @param args
     * @param proxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Cglib代理模式~开始");
        Object returnVal = method.invoke(target, args);
        System.out.println("Cglib代理模式~提交");
        return returnVal;
    }
}
