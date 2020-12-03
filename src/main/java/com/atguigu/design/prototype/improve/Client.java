package com.atguigu.design.prototype.improve;

/**
 * @author mcRae.su start
 * @create 2020-11-16 20:58
 * @description:
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep(1, "tom", "白色");
        sheep.setFriend(new Sheep(2,"jack","黑色"));

        // 对象.clone()方法只是浅拷贝，若要深拷贝必须实现Cloneable接口重写clone方法或者实现Serializable接口
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println("sheep2 = "+ sheep2 + "sheep.friend = "+ sheep2.getFriend().hashCode());
        System.out.println("sheep3 = "+ sheep3 + "sheep.friend = "+ sheep3.getFriend().hashCode());
        System.out.println("sheep4 = "+ sheep4 + "sheep.friend = "+ sheep4.getFriend().hashCode());
        System.out.println("sheep5 = "+ sheep5 + "sheep.friend = "+ sheep5.getFriend().hashCode());
    }
}
