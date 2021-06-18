package com.mickjoust.demo.jdp.chp3.a33_observer.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mickjoust
 */
public class MessagePublisher implements Subject {

    private List<MessageObserver> observers = new ArrayList<>();

    @Override
    public void attach(MessageObserver o) {
        observers.add(o);
    }

    @Override
    public void detach(MessageObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        observers.forEach(x->x.update(m));
    }

}
