package com.mickjoust.demo.jdp.chp3.a32_state;

/**
 * @author mickjoust
 */
public class StateB implements State {

    private static StateB instance = new StateB();

    public StateB() {
    }

    public static StateB instance(){
        return instance;
    }

    @Override
    public void handle(Context context) {
        System.out.println("=== 进入状态B");
        context.setCurrentState(this);
    }

}
