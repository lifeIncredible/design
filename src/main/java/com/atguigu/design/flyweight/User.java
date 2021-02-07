package com.atguigu.design.flyweight;

/**
 * @Program:com.atguigu.design.flyweight
 * @Author: mcrae.su
 * @Create: 2021-02-07 14:39
 * @Description:
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
