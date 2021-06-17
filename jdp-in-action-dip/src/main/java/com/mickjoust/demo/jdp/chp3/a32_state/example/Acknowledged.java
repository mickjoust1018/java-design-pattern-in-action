package com.mickjoust.demo.jdp.chp3.a32_state.example;

/**
 * @author mickjoust
 * 1 - 已下单
 */
public class Acknowledged implements PackageState {

    //Singleton
    private static Acknowledged instance = new Acknowledged();

    private Acknowledged() {}

    public static Acknowledged instance() {
        return instance;
    }


    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("=== state start...");
        System.out.println("1 - Package is acknowledged !!");
        ctx.setCurrentState(WarehouseProcessing.instance());
    }
}
