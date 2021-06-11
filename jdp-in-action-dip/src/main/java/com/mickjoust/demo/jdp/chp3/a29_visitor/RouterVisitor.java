package com.mickjoust.demo.jdp.chp3.a29_visitor;

/**
 * @author mickjoust
 * 不同路由器 的访问路径
 */
public interface RouterVisitor {

    void visit(DLinkRouter router);
    void visit(TPLinkRouter router);

}
