package com.atguigu.design.singleton;

/**
 * @Author: 苏晓虎
 * @Create: 2020-10-30 15:44
 * @Description: 静态内部类，懒汉式
 */
public class LazyTypeStaticInnerClass {

    private LazyTypeStaticInnerClass(){

    }

    private static volatile LazyTypeStaticInnerClass instance;

    private static class SingleonInstance{
        private static LazyTypeStaticInnerClass INSTANCE = new LazyTypeStaticInnerClass();
    }

    public static LazyTypeStaticInnerClass getInstance(){

        return SingleonInstance.INSTANCE;
    }

    /**
     *  1)这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
     *  2)静态内部类方式在LazyTypeStaticInnerClass类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法
     *    才会装载SingletonInstance类，从而完成Singleton的实例化。
     *  3) 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
     *  4) 优点：避免了线程不安全，利用了静态内部类特点实现延迟加载，效率高
     *  5) 结论：推荐使用
     */
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        LazyTypeStaticInnerClass instance1 = LazyTypeStaticInnerClass.getInstance();
        LazyTypeStaticInnerClass instance2 = LazyTypeStaticInnerClass.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2 .hashCode = " + instance2.hashCode());
    }
}

