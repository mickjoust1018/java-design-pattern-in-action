package com.mickjoust.demo.jdp.chp3.a21_protype;

/**
 * @author mickjoust
 */
public class ProtypeA implements PrototypeInterface {

    @Override
    public ProtypeA clone() throws CloneNotSupportedException {
        System.out.println("Cloning new object");
        return (ProtypeA) super.clone();
    }

}
