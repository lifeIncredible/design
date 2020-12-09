package com.atguigu.design.adapter.interfaceadapter;

/**
 * @author mcRae.su start
 * @create 2020-12-10 0:26
 * @description:
 */
public class InterfaceClient {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            /**
             * 只需要去覆盖我们需要使用的接口方法
             */
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        absAdapter.m1();
    }
}
