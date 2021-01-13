package com.atguigu.design.bridge;

/**
 * @Program:com.atguigu.design.bridge
 * @Author: mcrae.su
 * @Create: 2021-01-13 19:45
 * @Description:
 */
public class FoldedPhone extends  Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠式手机");
    }
}
