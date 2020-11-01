package com.atguigu.design.singleton;

/**
 * @Author: 苏晓虎
 * @Create: 2020-10-30 15:24
 * @Description: 懒汉式(线程安全，同步方法)
 */
public class LazyTypeSecurity {

    private LazyTypeSecurity() {
    }
    private static LazyTypeSecurity instance;
    public static synchronized LazyTypeSecurity getInstance(){
        if (instance == null){
             instance = new LazyTypeSecurity();
        }
        return instance;
    }

    /**
     * 优缺点说明：
     *  1.解决了线程安全问题
     *  2.效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
     *  而其实这个方法只执行一次实例化代码就够了，后面的想要获得该类实例，直接return就行了。方法进行同步效率太低
     *  3.结论：在实际开发中，不推荐这种方法
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("---懒汉式2，线程安全效率低----");
        LazyTypeSecurity instance1 = LazyTypeSecurity.getInstance();
        LazyTypeSecurity instance2 = LazyTypeSecurity.getInstance();
        System.out.println("是否相同:"+(instance1 == instance2));
        System.out.println("实例1的hash值"+instance1.hashCode());
        System.out.println("实例2的hash值"+instance2.hashCode());
    }
}
