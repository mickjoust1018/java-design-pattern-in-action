package com.mickjoust.demp.jdp.test;

import com.mickjoust.demo.jdp.chp3.singleton.Singleton;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author mickjoust
 **/
public class SingletonTest {

    @Test
    public void TestGetInstance() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Assert.assertEquals(singleton1,singleton2);
    }

}
