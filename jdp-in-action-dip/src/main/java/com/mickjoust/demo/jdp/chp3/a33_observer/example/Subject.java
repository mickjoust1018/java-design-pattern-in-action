package com.mickjoust.demo.jdp.chp3.a33_observer.example;

/**
 * @author mickjoust
 */
public interface Subject {

    void attach(MessageObserver o); //增加观察者
    void detach(MessageObserver o); //删除观察者
    void notifyUpdate(Message m);   //更新通知

}
