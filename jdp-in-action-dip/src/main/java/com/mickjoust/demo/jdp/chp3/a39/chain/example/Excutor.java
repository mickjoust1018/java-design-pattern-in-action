package com.mickjoust.demo.jdp.chp3.a39.chain.example;

/**
 * @author mickjoust
 */
public interface Excutor {
    void setNext(Excutor excutor);
    void handle(Integer num);
}
