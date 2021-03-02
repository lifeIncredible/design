package com.atguigu.design.command;

/**
 * @Program:com.atguigu.design.command
 * @Author: mcrae.su
 * @Create: 2021-03-02 19:56
 * @Description: 命令角色，需要执行的命令都在这里，也可以是抽象类
 */
public interface Command {
    //执行动作
    public void execute();
    //撤销动作
    public void undo();
}
