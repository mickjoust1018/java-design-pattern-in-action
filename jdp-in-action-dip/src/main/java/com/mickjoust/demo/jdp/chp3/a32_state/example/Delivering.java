package com.mickjoust.demo.jdp.chp3.a32_state.example;

/**
 * @author mickjoust
 * 4 - 派送中
 */
public class Delivering implements PackageState {

    //Singleton
    private static Delivering instance = new Delivering();

    private Delivering() {

    }

    public static Delivering instance() {
        return instance;
    }

    //Business logic
    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("4 - Package is Delivering !!");
        ctx.setCurrentState(WaitForPickUp.instance());
    }

}
