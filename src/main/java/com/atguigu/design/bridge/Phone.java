package com.atguigu.design.bridge;

/**
 * @Program:com.atguigu.design.bridge
 * @Author: mcrae.su
 * @Create: 2021-01-13 19:42
 * @Description:
 */
public class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }
    protected void open(){
        brand.open();
    }

    protected void close(){
        brand.close();
    }

    protected void call(){
        brand.call();
    }
}
