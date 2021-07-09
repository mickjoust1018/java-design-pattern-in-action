package com.mickjoust.demo.jdp.chp3.a39.chain;

/**
 * @author mickjoust
 */
public interface Handler {
    void setNext(Handler handler);
    void handle(Request request);
}
