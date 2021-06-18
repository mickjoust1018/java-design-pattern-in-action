package com.mickjoust.demo.jdp.chp3.a33_observer;

/**
 * @author mickjoust
 */
public class ObserverImpl implements Observer {

    @Override
    public void notify(String acct, double amt) {
        System.out.println("=== 接受到通知：账户："+acct + " 账单："+amt);
    }

}
