package com.atguigu.design.principle.inversion;

/**
 * @author 苏晓虎start
 * @create 2020-08-06 22:24
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
         person.getInfo(new Email());
    }
}

class Email{
    public String sendEmail(){
        return "电子邮件信息：hello word";
    }
}

//完成Person接收消息的共呢
//方式1分析
/*
*  1. 简单，比较容易想到
*  2. 如果我们过去的对象是微信，短信等等，则新增类，同时Person也要增加相应的接收方法
*  3. 解决思想：引入一个抽象的接口IReceiver,表示接收者，这样Person类与接口发生依赖
* */
class Person{
    public void getInfo(Email email){
        System.out.println(email.sendEmail());
    }
}