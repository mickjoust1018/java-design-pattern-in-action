package com.mickjoust.demo.jdp.chp3.singleton;

/**
 * @author mickjoust
 * xxx
 **/
public class Singleton {

    private static Singleton _instance;

    private Singleton(){

    };

    public static Singleton getInstance(){
        if (null == _instance){
            _instance = new Singleton();
        }
        return _instance;
    }

}
