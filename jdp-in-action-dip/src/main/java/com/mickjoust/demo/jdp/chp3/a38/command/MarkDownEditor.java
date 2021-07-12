package com.mickjoust.demo.jdp.chp3.a38.command;

/**
 * @author mickjoust
 */
public class MarkDownEditor implements Editor {

    @Override
    public void open() {
        System.out.println("=== MarkDownEditor 执行 open 操作");
    }

    @Override
    public void save() {
        System.out.println("=== MarkDownEditor 执行 save 操作");
    }

    @Override
    public void close() {
        System.out.println("=== MarkDownEditor 执行 close 操作");
    }
}
