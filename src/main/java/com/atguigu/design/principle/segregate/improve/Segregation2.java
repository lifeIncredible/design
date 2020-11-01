package com.atguigu.design.principle.segregate.improve;

/**
 * @Author 苏晓虎
 * @Description:
 * @create 2020-05-20 23:49
 */
public class Segregation2 {
    public static void main(String[] args) {
        //使用
        A a = new A();
        a.dpend1(new B()); //A类通过接口去依赖B类
        a.dpend2(new B());
        a.dpend3(new B());


        C c = new C();
        c.dpend1(new D()); //C类通过接口依赖(使用)D类
        c.dpend2(new D());
    }
}


interface  Interface1{
    void operation1();
}

interface  Interface2{
    void operation2();
    void operation3();

}

interface  Interface3{
    void operation4();
    void operation5();
}

class B implements Interface1,Interface2{

    @Override
    public void operation1() {
        System.out.println("B实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了 operation3");
    }
}

class D implements Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation 1");
    }

    @Override
    public void operation4() {
        System.out.println("D实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了 operation5");
    }
}


class A{ //A类 通过接口Interface1,Interface2依赖B类,只会使用到1,2,3方法
    public void dpend1(Interface1 i){
        i.operation1();
    }
    public void dpend2(Interface2 i){
        i.operation3();
    }

    public void dpend3(Interface2 i){
        i.operation2();
    }
}

class C{    //A类 通过接口Interface3 依赖于D类，只会使用到4,5方法
    public void dpend1(Interface3 interface3){
        interface3.operation4();
    }

    public void dpend2(Interface3 interface3){
        interface3.operation5();
    }
}