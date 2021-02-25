package com.atguigu.design.templatemethod;

/**
 * @Program:com.atguigu.design.templatemethod.theroy
 * @Author: mcrae.su
 * @Create: 2021-02-24 19:56
 * @Description: 抽象类表示豆浆
 */
public abstract class SoyaMilk {

    //模板方法-make，模板方法做成final
    final void make(){
        select();
        if (customerWantCondiments()){
            addCondiments();
        }
        soak();
        peak();
    }

    /**
     * 选材
     */
    protected void select(){
        System.out.println("选好材料");
    }

    /**
     * 添加不同的配料，子类实现
     */
    abstract void addCondiments();

    protected void soak(){
        System.out.println("开始浸泡3小时");
    }

    protected void peak(){
        System.out.println("将材料放到榨汁机打碎");
    }

    /**
     * 钩子方法
     * @return
     */
    protected boolean customerWantCondiments(){
        //......业务逻辑

        return true;
    }
}

