package com.atguigu.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program:com.atguigu.design.composite
 * @Author: mcrae.su
 * @Create: 2021-01-27 13:29
 * @Description: University就是Composite,可以管理College
 */
public class University extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents =  new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println("---------"+getName()+"----------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
