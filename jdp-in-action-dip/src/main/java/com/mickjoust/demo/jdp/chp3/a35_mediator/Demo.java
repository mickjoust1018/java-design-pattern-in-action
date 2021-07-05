package com.mickjoust.demo.jdp.chp3.a35_mediator;

/**
 * @author mickjoust
 **/
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();

        Component componentA = new ComponentA(mediator);
        componentA.exec("key-A");
        Component componentB = new ComponentB(mediator);
        componentB.exec("key-B");
    }
}
