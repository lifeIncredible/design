package com.atguigu.design.prototype;

/**
 * @author mcRae.su start
 * @create 2020-11-09 22:02
 * @description:
 */
public class Sheep {

    private int    age;
    private String name;
    private String color;

    public Sheep(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public Sheep() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "age:"+ getAge()+"\t"+"name:"+getName()+"\t"+"color:"+getColor()+"\t";
    }
}
