package com.mickjoust.demo.jdp.chp3.a22_adapter;

/**
 * @author mickjoust
 **/
public class Adapter extends TargetAbstraction {

    private OtherClass otherClass;

    public Adapter() {
        otherClass = new OtherClass();
    }

    @Override
    public String filter(String str) {
        otherClass.preCheck(str);
        return otherClass.replace(str);
    }

}
