package com.mickjoust.demo.jdp.chp3.a32_state.example;

/**
 * @author mickjoust
 * 5 - 待取件
 */
public class WaitForPickUp implements PackageState {

    //Singleton
    private static WaitForPickUp instance = new WaitForPickUp();

    private WaitForPickUp() {}

    public static WaitForPickUp instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("5 - Package is waiting for pick up !!");
        ctx.setCurrentState(Received.instance());
    }
}
