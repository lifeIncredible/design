package com.atguigu.design.principle.inversion.improve;

/**
 * @author 苏晓虎start
 * @create 2020-08-06 22:24
 */
public class DependecyInversion {
    public static void main(String[] args) {
       Person person = new Person();
         person.receive(new Email());
         person.receive(new Wechat());
    }
}

interface IReceiver{
    String getInfo();
}

class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "电子邮件信息：hello word";
    }
}

class Wechat implements IReceiver{

    @Override
    public String getInfo() {
        return "微信信息: hello word";
    }
}


/**
 * 方式二
 */
class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}