package com.mickjoust.demo.jdp.chp3.a33_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mickjoust
 */
public class PublisherImpl implements Publisher {

    private String acct;
    private double balance;
    private List<Observer> myObservers;

    public PublisherImpl(String anAcct, double aBalance) {
        acct = anAcct;
        balance = aBalance;
        myObservers = new ArrayList();
    }

    public void addObserver(Observer o){
        myObservers.add(o);
    }

    public void removeObserver(Observer o) {
        myObservers.remove(o);
    }

    public void notify(double amt) {
        balance -= amt;
        if(balance < 0) {
            overdrawn();
        }
    }

    private void overdrawn() {
        for (Observer o: myObservers) {
            o.notify(acct, balance);
        }
    }
}
