package com.atguigu.design.proxy.state;

/**
 * @Program:com.atguigu.design.proxy.state
 * @Author: mcrae.su
 * @Create: 2021-02-07 15:59
 * @Description: 代理对象
 */
public class TeacherProxy implements  ITheacherDao {

    private ITheacherDao target;

    public TeacherProxy(ITheacherDao iTheacherDao) {
        this.target = iTheacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理...完成某些操作");
        target.teach();
        System.out.println("提交。。。。");
    }
}
