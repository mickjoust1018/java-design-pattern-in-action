package com.mickjoust.demo.jdp.chp3.a30_templatemethod;

/**
 * @author mickjoust
 */
public class ConcreteClassA extends AbstractClassTemplate {

    @Override
    void step3() {
        System.out.println("===在子类 A 中 执行：步骤3");
    }

    @Override
    void step4() {
        System.out.println("===在子类 A 中 执行：步骤4");
    }

}
