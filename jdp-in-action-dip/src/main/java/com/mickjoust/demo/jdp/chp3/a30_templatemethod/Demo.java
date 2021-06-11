package com.mickjoust.demo.jdp.chp3.a30_templatemethod;

/**
 * @author mickjoust
 **/
public class Demo {
    public static void main(String[] args) {
        AbstractClassTemplate concreteClassA = new ConcreteClassA();
        concreteClassA.run("");

        System.out.println("===========");

        AbstractClassTemplate concreteClassB = new ConcreteClassB();
        concreteClassB.run("x");

    }
}