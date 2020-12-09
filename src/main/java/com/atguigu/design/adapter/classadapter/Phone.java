package com.atguigu.design.adapter.classadapter;

/**
 * @author mcRae.su start
 * @create 2020-12-09 23:39
 * @description:
 */
public class Phone {

    /**
     * 充电
     */
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V()== 5){
            System.out.println("手机获取电压为5V，可以充电~~~");
        } else if (iVoltage5V.output5V()>5){
            System.out.println("手机获取电压大于5V，不能充电！！！");
        }
    }
}
