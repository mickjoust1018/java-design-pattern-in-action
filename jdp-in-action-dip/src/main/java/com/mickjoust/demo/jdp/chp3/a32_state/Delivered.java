package com.mickjoust.demo.jdp.chp3.a32_state;

/**
 * @author mickjoust
 */
public class Delivered implements PackageState {

    //Singleton
    private static Delivered instance = new Delivered();

    private Delivered() {

    }

    public static Delivered instance() {
        return instance;
    }

    //Business logic
    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is delivered!!");
    }

}
