package com.mickjoust.demo.jdp.chp3.a29_visitor;

/**
 * @author mickjoust
 * @author jingfeng.huang
 * @since 2021/6/9 16:02
 */
public interface Visitor {

    void visitA(ElementA elementA);
    void visitB(ElementB elementB);
    //...
    //void visitN(ElementN elementN);
}
