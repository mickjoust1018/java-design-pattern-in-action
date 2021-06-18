package com.mickjoust.demo.jdp.chp3.a33_observer;

/**
 * @author mickjoust
 */
public interface Publisher {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notify(double amt);
}
