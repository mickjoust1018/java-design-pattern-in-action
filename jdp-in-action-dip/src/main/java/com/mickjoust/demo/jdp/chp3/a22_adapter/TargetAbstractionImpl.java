package com.mickjoust.demo.jdp.chp3.a22_adapter;

/**
 * @author mickjoust
 **/
public class TargetAbstractionImpl extends TargetAbstraction {

    @Override
    public String filter(String str) {
        return str.replaceAll("a","A");
    }

}
