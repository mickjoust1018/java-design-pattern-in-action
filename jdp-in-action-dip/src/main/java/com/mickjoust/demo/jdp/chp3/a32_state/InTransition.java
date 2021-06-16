package com.mickjoust.demo.jdp.chp3.a32_state;

/**
 * @author mickjoust
 */
public class InTransition implements PackageState
{
    //Singleton
    private static InTransition instance = new InTransition();
 
    private InTransition() {}
 
    public static InTransition instance() {
        return instance;
    }
     
    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is in transition !!");
        ctx.setCurrentState(OutForDelivery.instance());
    }
}