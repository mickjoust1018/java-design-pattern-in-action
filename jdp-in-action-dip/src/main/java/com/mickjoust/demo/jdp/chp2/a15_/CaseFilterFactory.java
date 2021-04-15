package com.mickjoust.demo.jdp.chp2.a15_;

/**
 * @author mickjoust
 **/
public class CaseFilterFactory {

    public static CaseFilter getFilter(String name){
        if ("up".equals(name)) {
            return new UpperCaseFilter();
        }
        if ("low".equals(name)) {
            return new LowerCaseFilter();
        }
        return new UpperCaseFilter();
    }
}
