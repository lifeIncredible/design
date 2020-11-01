package com.atguigu.design.singleton;

/**
 * @Author: 苏晓虎
 * @Create: 2020-10-30 11:58
 * @Description: 单例模式之饿汉式,步骤如下：1.构造器私有化 2.类的内部创建对象 3.向外暴露一个静态的公共方法
 */
public class HungryType {

    private HungryType() {
    }

    private static final HungryType instance = new HungryType();

    public static HungryType getInstance(){

        return instance;
    }

    /**
     * 优缺点说明:
     *  1.优点: 这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
     *  2.缺点： 在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存浪费
     *  3.这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，在单例模式中大多数都是调用getInstance方法，
     *  但是导致类装载的原因有很多种，因此不能确定有其他的方式(或者其他的静态方法)导致类装载，这时候初始化instance就没达到lazy loading的效果
     *  4.结论: 这种单例模式可用，但是会造成内存浪费。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("---饿汉式开始----");
        HungryType instance1 = HungryType.getInstance();
        HungryType instance2 = HungryType.getInstance();
        System.out.println("是否相同:"+(instance1 == instance2));
        System.out.println("实例1的hash值"+instance1.hashCode());
        System.out.println("实例2的hash值"+instance2.hashCode());
    }
}
