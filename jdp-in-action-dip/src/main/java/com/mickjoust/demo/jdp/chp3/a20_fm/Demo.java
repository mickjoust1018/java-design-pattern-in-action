package com.mickjoust.demo.jdp.chp3.a20_fm;

/**
 * @author mickjoust
 */
public class Demo {

    public static void main(String[] args) {
        IProduct iProduct = ProductFactory.getProduct("");
        iProduct.apply();
        IProduct iProducta = ProductFactory.getProduct("a");
        iProducta.apply();
    }
}
