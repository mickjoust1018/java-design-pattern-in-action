package com.mickjoust.demo.jdp.chp2.a15_;

/**
 * @author mickjoust
 **/
public class LowerCaseFilter implements CaseFilter {


    @Override
    public String filter(String str) {
        return str.replaceAll("s","xxx").toLowerCase();
    }


}
