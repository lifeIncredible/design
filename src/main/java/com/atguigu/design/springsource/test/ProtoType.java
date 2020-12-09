package com.atguigu.design.springsource.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mcRae.su start
 * @create 2020-12-01 0:19
 * @description:
 */
public class ProtoType {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object bean1 = applicationContext.getBean("id01");
        System.out.println("bean"+ bean1);

        Object bean2 = applicationContext.getBean("id01");
        System.out.println("bean"+ bean2);
    }
}
