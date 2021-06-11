package com.mickjoust.demo.jdp.chp3.a29_visitor;

/**
 * @author mickjoust
 */
public class WindowsRouterVisitor implements RouterVisitor{

    @Override
    public void visit(DLinkRouter router) {
        System.out.println("=== DLinkRouter Windows config visit success!");
    }

    @Override
    public void visit(TPLinkRouter router) {
        System.out.println("=== DLinkRouter Windows config visit success!");
    }

}
