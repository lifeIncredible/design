package com.atguigu.design.adapter.classadapter;

/**
 * @author mcRae.su start
 * @create 2020-12-09 23:36
 * @description: 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    @Override
    public int output5V() {
        //获取到220v电压
        int srcV = output220V();
        //转成5V
        int dstV = srcV /44 ;
        System.out.println("适配器获取到电压="+ srcV +"伏，并转换为"+ dstV +"伏电压");
        return dstV;
    }
}
