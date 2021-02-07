package com.atguigu.design.flyweight;

/**
 * @Program:com.atguigu.design.flyweight
 * @Author: mcrae.su
 * @Create: 2021-02-07 14:41
 * @Description:
 */
public class FlyweightClient {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite site1 = webSiteFactory.getWebSiteCategory("新闻");
        site1.use(new User("余祚民"));

        WebSite site2 = webSiteFactory.getWebSiteCategory("博客");
        site2.use(new User("Bob"));

        WebSite site3 = webSiteFactory.getWebSiteCategory("微信公众号");
        site3.use(new User("麦克雷"));

        System.out.println("网站的分类=" + webSiteFactory.getWebSiteCount());
    }
}
