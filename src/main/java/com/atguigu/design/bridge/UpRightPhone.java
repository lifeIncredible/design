package com.atguigu.design.bridge;

/**
 * @Program:com.atguigu.design.bridge
 * @Author: mcrae.su
 * @Create: 2021-01-13 19:46
 * @Description:
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        super.open();
        System.out.println("旋转样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("旋转样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("旋转式手机");
    }
}
