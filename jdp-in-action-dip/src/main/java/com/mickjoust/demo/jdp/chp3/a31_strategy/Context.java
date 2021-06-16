package com.mickjoust.demo.jdp.chp3.a31_strategy;

/**
 * @author mickjoust
 */
public class Context {
    public void request(Strategy s) {
        s.operation();
    }
}
