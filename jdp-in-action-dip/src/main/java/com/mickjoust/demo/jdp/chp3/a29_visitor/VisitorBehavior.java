package com.mickjoust.demo.jdp.chp3.a29_visitor;

/**
 * @author mickjoust
 * @author jingfeng.huang
 * @since 2021/6/9 16:15
 */
public class VisitorBehavior implements Visitor {

    @Override
    public void visitA(ElementA elementA) {
        int x = elementA.getAState();
        x++;
        System.out.println("=== 当前A的state为："+x);
        elementA.setAState(x);
    }

    @Override
    public void visitB(ElementB elementB) {
        double x = elementB.getBState();
        x++;
        System.out.println("=== 当前B的state为："+x);
        elementB.setBState(x);
    }
}
