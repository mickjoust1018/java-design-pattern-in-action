package com.mickjoust.demo.jdp.chp3.a29_visitor;

/**
 * @author mickjoust
 */
public class TPLinkRouter implements Router {

    @Override
    public void sendData(char[] data) {

    }

    @Override
    public void accept(RouterVisitor v) {
        v.visit(this);
    }

}
