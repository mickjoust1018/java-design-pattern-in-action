package com.mickjoust.demo.jdp.chp3.a21_protype;

/**
 * @author mickjoust
 * 电子书
 */
public class EBook implements IPrototype {

    @Override
    public EBook clone() throws CloneNotSupportedException {
        System.out.println("Cloning Book object..");
        return (EBook) super.clone();
    }

    @Override
    public String toString() {
        return "EBook{}";
    }

}
