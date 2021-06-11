package com.mickjoust.demo.jdp.chp3.a29_visitor;

/**
 * @author mickjoust
 */
public interface Router {

    void sendData(char[] data);

    void accept(RouterVisitor v);
}
