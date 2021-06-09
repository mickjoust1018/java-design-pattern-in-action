package com.mickjoust.demo.jdp.chp3.a29_visitor;

/**
 * @author mickjoust
 * @author jingfeng.huang
 * @since 2021/6/9 16:00
 */
public interface Element {

    void accept(Visitor v);
}
