package com.mickjoust.demo.jdp.chp3.a28_proxy;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author mickjoust
 */
public class Demo {
    public static void main(String[] args) {
        RealObject realObjectProxy = new Proxy();
        realObjectProxy.doSomething();

    }
}
