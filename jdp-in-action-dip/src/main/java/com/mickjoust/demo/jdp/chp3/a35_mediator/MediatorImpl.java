package com.mickjoust.demo.jdp.chp3.a35_mediator;

/**
 * @author mickjoust
 */
public class MediatorImpl implements Mediator{

    @Override
    public void apply(String key) {
        System.out.println("最终中介者执行操作，key为："+key);
    }

}
