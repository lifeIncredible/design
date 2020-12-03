package com.atguigu.design.prototype.improve;

/**
 * @author mcRae.su start
 * @create 2020-11-09 22:02
 * @description:
 */
public class Sheep implements Cloneable{

    private int    age;
    private String name;
    private String color;
    private Sheep friend;

    public Sheep(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public Sheep() {
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
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

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
