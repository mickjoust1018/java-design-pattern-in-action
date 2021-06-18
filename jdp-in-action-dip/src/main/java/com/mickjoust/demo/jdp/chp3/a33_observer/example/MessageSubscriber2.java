package com.mickjoust.demo.jdp.chp3.a33_observer.example;

/**
 * @author mickjoust
 */
public class MessageSubscriber2 implements MessageObserver {

    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriber2 :: " + m.getContent());
    }

}
