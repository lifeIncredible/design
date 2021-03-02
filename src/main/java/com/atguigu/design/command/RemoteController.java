package com.atguigu.design.command;

/**
 * @Program:com.atguigu.design.command
 * @Author: mcrae.su
 * @Create: 2021-03-02 20:09
 * @Description:
 */
public class RemoteController {
    //开按钮的命令组
    Command[] onCommands;
    Command[] offCommands;
    //执行撤销的命令
    Command undoCommand;

    //构造器完成对按钮初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 按下开按钮
     * @param no
     */
    public void onButtonWasPushed(int no){
        //找到按下的按钮，并执行对应的方法
        onCommands[no].execute();
        //记录此次操作用于撤销
        undoCommand = onCommands[no];
    }

    /**
     * 按下关按钮
     * @param no
     */
    public void offButtonWasPushed(int no){
        //找到按下的按钮，并执行对应的方法
        offCommands[no].execute();
        //记录此次操作用于撤销
        undoCommand = offCommands[no];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
