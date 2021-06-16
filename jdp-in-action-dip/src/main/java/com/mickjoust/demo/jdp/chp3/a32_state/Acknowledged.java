package com.mickjoust.demo.jdp.chp3.a32_state;

/**
 * @author mickjoust
 * @author jingfeng.huang
 * @since 2021/6/16 19:27
 * 已确认
 */
public class Acknowledged implements PackageState{

    //Singleton
    private static Acknowledged instance = new Acknowledged();

    private Acknowledged() {}

    public static Acknowledged instance() {
        return instance;
    }


    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is acknowledged !!");
        ctx.setCurrentState(Shipped.instance());
    }
}
