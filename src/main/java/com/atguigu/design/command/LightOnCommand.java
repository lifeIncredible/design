package com.atguigu.design.command;

/**
 * @Program:com.atguigu.design.command
 * @Author: mcrae.su
 * @Create: 2021-03-02 20:02
 * @Description:
 */
public class LightOnCommand implements Command {

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
