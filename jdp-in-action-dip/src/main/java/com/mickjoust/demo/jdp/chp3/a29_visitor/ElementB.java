package com.mickjoust.demo.jdp.chp3.a29_visitor;

/**
 * @author mickjoust
 * @author jingfeng.huang
 * @since 2021/6/9 16:03
 */
public class ElementB implements Element {

    private double stateForB = 0.0;

    public void accept(Visitor v) {
        System.out.println("=== 开始访问元素 B......");
        v.visitB(this);
    }

    public double getBState(){
        return stateForB;
    }

    public void setBState(double value){
        stateForB = value;
    }

}
