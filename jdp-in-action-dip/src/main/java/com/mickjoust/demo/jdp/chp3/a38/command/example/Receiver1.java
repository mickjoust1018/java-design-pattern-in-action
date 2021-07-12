package com.mickjoust.demo.jdp.chp3.a38.command.example;

/**
 * @author mickjoust
 */
public class Receiver1 implements Receiver {


    @Override
    public void operationA() {
        System.out.println("操作 A");
    }

    @Override
    public void operationB() {
        System.out.println("操作 B");
    }

    @Override
    public void operationC() {
        System.out.println("操作 C");
    }
}
