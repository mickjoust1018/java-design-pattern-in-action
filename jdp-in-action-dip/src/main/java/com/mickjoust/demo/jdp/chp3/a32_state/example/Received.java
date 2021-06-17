package com.mickjoust.demo.jdp.chp3.a32_state.example;

/**
 * @author mickjoust
 * 6 - 已签收
 */
public class Received implements PackageState {

    //Singleton
    private static Received instance = new Received();

    private Received() {}

    public static Received instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("6 - Package is Received !!");
        System.out.println("=== state end ");
    }
}
