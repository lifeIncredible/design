package com.atguigu.design.composite;

/**
 * @Program:com.atguigu.design.composite
 * @Author: mcrae.su
 * @Create: 2021-01-27 13:36
 * @Description: 叶子节点
 */
public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
