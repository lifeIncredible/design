package com.atguigu.design.singleton;

/**
 * @Author: 苏晓虎
 * @Create: 2020-10-30 15:16
 * @Description: 懒汉式，多线程不安全
 */
public class LazyTypeInsecurity {

    private LazyTypeInsecurity(){

    }
    private static LazyTypeInsecurity instance;

    public static LazyTypeInsecurity getInstance(){
        if (instance == null){
            instance = new LazyTypeInsecurity();
        }
        return  instance;
    }

    /**
     * @param args
     * 优缺点说明： 1)起到了Lazy Loading的效果，但是只能在单线程下使用。
     *             2)如果在多线程下，一个线程进入了if(singleton == null) 判断语句块,另一个线程也通过了这个判断语句
     *             这时便会产生多个实例。所以在多线程环境下不可使用这种方式
     *             3）结论：在实际开发中，不要使用这种方式
     */
    public static void main(String[] args) {
        System.out.println("---懒汉式1，线程不安全----");
        LazyTypeInsecurity instance1 = LazyTypeInsecurity.getInstance();
        LazyTypeInsecurity instance2 = LazyTypeInsecurity.getInstance();
        System.out.println("是否相同:"+(instance1 == instance2));
        System.out.println("实例1的hash值"+instance1.hashCode());
        System.out.println("实例2的hash值"+instance2.hashCode());
    }
}
