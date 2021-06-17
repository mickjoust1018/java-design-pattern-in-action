package com.mickjoust.demo.jdp.chp3.a32_state.example;

/**
 * @author mickjoust
 * 3 - 运输中
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
    public void updateState(PackageContext ctx) {
        System.out.println("3 - Package is in transition !!");
        ctx.setCurrentState(Delivering.instance());
    }
}