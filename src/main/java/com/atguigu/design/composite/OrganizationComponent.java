package com.atguigu.design.composite;

/**
 * @Program:com.atguigu.design.composite.theory
 * @Author: mcrae.su
 * @Create: 2021-01-27 13:24
 * @Description:
 */
public abstract class OrganizationComponent {
    /**
     * 名字
     */
    private String name;
    /**
     * 说明
     */
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected abstract void print();
}
