package com.mickjoust.demo.jdp.chp2.a10_pie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author mickjoust
 **/
public class T {

    private Set<String> pns = new HashSet();
    private int s = 0;

    private Boolean f(String n) {
        return pns.contains(n);
    }

    int getS() {
        return s;
    }

    int s(List<T> ts, String n) {
        for (T t :ts) {
            if (t.f(n)) {
                return t.getS();
            }
        }
        return 0;
    }

}
