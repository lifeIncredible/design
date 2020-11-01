package com.atguigu.design.singleton;

/**
 * @Author: 苏晓虎
 * @Create: 2020-10-30 15:59
 * @Description:
 */
public enum LazyTypeEnum {

    INSTANCE(); //属性
    public void sayOk(){
        System.out.println("it's ok");
    }
}
/**
 * 优缺点说明: 借助JDK1.5的枚举帮助实现单例模式，不仅能避免多线程同步问题，而且还能防止反序列化重新创建的对象。
 * 这种方式是Effective java作者Josh Bloch提倡的方式
 * 推荐使用
 * */

class EnumTest{
    public static void main(String[] args) {
        LazyTypeEnum instance1 = LazyTypeEnum.INSTANCE;
        LazyTypeEnum instance2 = LazyTypeEnum.INSTANCE;
        System.out.println("是否相等:"+(instance1 == instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}