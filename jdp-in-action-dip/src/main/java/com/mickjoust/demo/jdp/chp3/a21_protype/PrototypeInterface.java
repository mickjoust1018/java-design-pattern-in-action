package com.mickjoust.demo.jdp.chp3.a21_protype;

/**
 * @author mickjoust
 */
public interface PrototypeInterface extends Cloneable {

    PrototypeInterface clone() throws CloneNotSupportedException;

}
