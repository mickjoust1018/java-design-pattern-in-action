package com.mickjoust.demo.jdp.chp3.a20_fm;

/**
 * @author mickjoust
 */
public class ProductFactory {

    public static IProduct getProduct(String name){
        if ("a".equals(name)) {
            return new Product_A_Impl();
        }
        return new Product_B_Impl();
    }

}
