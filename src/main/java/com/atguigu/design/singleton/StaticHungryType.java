package com.atguigu.design.singleton;

/**
 * @Author: 苏晓虎
 * @Create: 2020-10-30 12:07
 * @Description: 饿汉式(静态变量)
 * 优缺点说明：
 *  1)这种方式和非静态的饿汉式方式类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行代码块中的代码，初始化类的实例。
 *  2）结论：这种单例模式可用，但是可能造成内存浪费
 */
public class StaticHungryType {

    //1.构造器私有化
    private StaticHungryType() {
    }

    private static StaticHungryType instance;

    //2.在静态代码块中，创建单例对象
    static {
        instance = new StaticHungryType();
    }

    //3.提供一个共有的静态方法，返回实例对象
    public static StaticHungryType getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("---饿汉式开始----");
        StaticHungryType instance1 = StaticHungryType.getInstance();
        StaticHungryType instance2 = StaticHungryType.getInstance();
        System.out.println("是否相同:"+(instance1 == instance2));
        System.out.println("实例1的hash值"+instance1.hashCode());
        System.out.println("实例2的hash值"+instance2.hashCode());
    }

}
