package com.mickjoust.demo.jdp.chp3.a33_observer.example;

/**
 * @author mickjoust
 */
public class MessageSubscriber1 implements MessageObserver {

    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriber1 :: " + m.getContent());
    }

}
