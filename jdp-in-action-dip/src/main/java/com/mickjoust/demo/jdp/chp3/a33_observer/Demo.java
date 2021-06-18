package com.mickjoust.demo.jdp.chp3.a33_observer;

/**
 * @author mickjoust
 **/
public class Demo {
    public static void main(String[] args) {
        Publisher account = new PublisherImpl("TEST123", 10.00);

        Observer bill = new ObserverImpl();

        account.addObserver(bill);

        account.notify(11.00);
    }
}
