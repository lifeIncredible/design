package com.atguigu.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Program:com.atguigu.design.proxy.dynamic
 * @Author: mcrae.su
 * @Create: 2021-02-07 16:13
 * @Description:
 */
public class ProxyFactory {

    /**
     * 维护一个即将被代理对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        /**
         * static Object newProxyInstance(ClassLoader loader, Class<?>[]interfaces,InvocationHandler h )
         *  ClassLoader: 指定当前目标对象使用的类加载器，获取加载器的方法固定
         *  Class<?>[]interfaces：目标对象实现的接口类型，使用泛型方法确认类型
         *  InvocationHandler h：事情处理，执行目标对象的方法时，会触发事情处理器方法，会把当前执行目标对象的方法作为参数传入
         *
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK动态代理开始。。。");
                Object invoke = method.invoke(target, args);
                System.out.println("JDK动态代理提交。。。");
                return invoke;
            }
        });
    }
}
