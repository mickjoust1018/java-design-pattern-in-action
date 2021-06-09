package com.mickjoust.demo.jdp.chp3.a29_visitor;

/**
 * @author mickjoust
 * @author jingfeng.huang
 * @since 2021/6/9 16:03
 */
public class ElementA implements Element {

    private int stateForA = 0;

    public void accept(Visitor v) {
        System.out.println("=== 开始访问元素 A......");
        v.visitA(this);
    }

    public int getAState(){
        return stateForA;
    }

    public void setAState(int value){
        stateForA = value;
    }
}
