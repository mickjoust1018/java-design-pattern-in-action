package com.mickjoust.demo.jdp.chp3.a39.chain.example;

/**
 * @author mickjoust
 */
public class Client {
    public static void main(String[] args) {
        Chain chain = new Chain();

        chain.process(99);
        System.out.println("------");
        chain.process(-11);
        System.out.println("------");
        chain.process(0);
        System.out.println("------");
        chain.process(null);
    }
}
