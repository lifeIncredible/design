package com.atguigu.design.prototype;

/**
 * @author mcRae.su start
 * @create 2020-11-09 22:05
 * @description:
 */
public class SheepClient {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(1, "tom", "白色");
        Sheep sheep1 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());
        Sheep sheep6 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());
        Sheep sheep7 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());
        Sheep sheep8 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());
        Sheep sheep9 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        System.out.println(sheep6);
        System.out.println(sheep7);
        System.out.println(sheep8);
        System.out.println(sheep9);
    }

}
