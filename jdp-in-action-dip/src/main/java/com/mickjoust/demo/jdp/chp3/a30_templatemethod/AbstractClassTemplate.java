package com.mickjoust.demo.jdp.chp3.a30_templatemethod;

/**
 * @author mickjoust
 */
public abstract class AbstractClassTemplate {


    void step1(String key){
        //dosomthing
        System.out.println("=== 在模板类里 执行步骤 1");
        if (step2(key)) {
            step3();
        } else {
            step4();
        }
        step5();
    }

    boolean step2(String key){
        System.out.println("=== 在模板类里 执行步骤 2");
        if ("x".equals(key)) {
            return true;
        }
        return false;
    }

    abstract void step3();
    abstract void step4();

    void step5() {
        System.out.println("=== 在模板类里 执行步骤 5");
    }

    void run(String key){
        step1(key);
    }

}
