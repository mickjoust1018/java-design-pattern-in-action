package com.mickjoust.demo.jdp.chp3.a33_observer.example;

/**
 * @author mickjoust
 */
public class Client {

    public static void main(String[] args) {
        MessageObserver s1 = new MessageSubscriber1();
        MessageObserver s2 = new MessageSubscriber2();
        MessageObserver s3 = new MessageSubscriber3();

        Subject p = new MessagePublisher();

        p.attach(s1);//
        p.attach(s2);

        p.notifyUpdate(new Message("First Message"));   //s1和s2会收到消息通知

        p.detach(s1);
        p.attach(s3);

        p.notifyUpdate(new Message("Second Message")); //s2和s3会收到消息通知
    }

}
