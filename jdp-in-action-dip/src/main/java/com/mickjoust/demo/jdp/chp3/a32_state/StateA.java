package com.mickjoust.demo.jdp.chp3.a32_state;

/**
 * @author mickjoust
 */
public class StateA implements State{

    private static StateA instance = new StateA();

    public StateA() {
    }

    public static StateA instance(){
        return instance;
    }

    @Override
    public void handle(Context context) {
        System.out.println("=== 进入状态A");
        context.setCurrentState(StateB.instance());
    }

}
