package com.atguigu.design.flyweight;

/**
 * @Program:com.atguigu.design.flyweight
 * @Author: mcrae.su
 * @Create: 2021-02-07 14:44
 * @Description:
 */
public class ConcreteWebSite extends WebSite {
    /**
     * 网站发布的形式(类型)
     */
    private String type = "";

    /**
     * 构造器
     * @param type
     */
    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:" + type + "在使用中.. 使用者是" + user.getName());
    }
}
