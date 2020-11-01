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
 * 优缺点说明: 借助JDK1.5的枚举帮助实现，推荐使用
 * */