package com.mickjoust.demo.jdp.chp3.a39.chain.example;

/**
 * @author mickjoust
 */
public class Chain {

    Excutor chain;

    public Chain(){
        buildChain();
    }

    private void buildChain(){
        Excutor e1 = new NegativeExcutor();
        Excutor e2 = new ZeroExcutor();
        Excutor e3 = new PositiveExcutor();
        e1.setNext(e2);
        e2.setNext(e3);

        this.chain = e1;
    }

    public void process(Integer num) {
        chain.handle(num);
    }

}
