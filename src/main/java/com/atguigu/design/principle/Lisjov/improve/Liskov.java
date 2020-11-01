package com.atguigu.design.principle.Lisjov.improve;

/**1
 * @author 苏晓虎start
 * @create 2020-08-19 21:43
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 -3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("__________________");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("1-8=" + b.func1(1, 8));
        System.out.println("11-3+9=" + b.func2(11, 3));
    }
}


//创建一个更加基础的基类
class Base{
    //把更基础的方法和成员写到Base类中
}

class A extends Base{
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

/**
 * B类继承A类，增加了一个新的功能：完成两个数相加，然后和9求和
 */
class B extends Base {
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}


