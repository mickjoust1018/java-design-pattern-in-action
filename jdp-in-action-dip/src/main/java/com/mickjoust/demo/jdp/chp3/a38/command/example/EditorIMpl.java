package com.mickjoust.demo.jdp.chp3.a38.command.example;

/**
 * @author mickjoust
 */
public class EditorIMpl implements Editor{


    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public void open() {
        System.out.println("打开");
    }

    @Override
    public void close() {
        System.out.println("关闭");
    }
}
