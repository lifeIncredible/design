package com.atguigu.design.decorator;

/**
 * @author SXH
 * @create 2021-01-16 15:44
 * @description: 浓缩咖啡 即不加牛奶、糖或巧克力等添加物的清咖啡
 */
public class ShortBlack extends Coffee{

    public ShortBlack() {
        setDes("浓缩咖啡");
        setPrice(4.0f);
    }
}
