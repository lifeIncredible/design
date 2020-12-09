package com.atguigu.design.adapter.objadapter;

/**
 * @author mcRae.su start
 * @create 2020-12-09 23:36
 * @description: 适配器类
 */
public class VoltageAdapter implements IVoltage5V {

    /**
     * 【关联关系聚合】
     */
    private Voltage220V voltage220V;

    /**
     * 通过构造器传入一个Voltage220V的实例
     * @param voltage220V
     */
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    /**
     * 通过setter方法传入一个Voltage220V的实例
     * @param voltage220V
     */
    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
      int dst = 0;
      if (null != voltage220V){
          int src = voltage220V.output220V();
          System.out.println("使用对象适配器，进行转换~~~");
          dst = src /44;
          System.out.println("适配完成，输出的电压=" + dst);
      }
        return dst;
    }
}
