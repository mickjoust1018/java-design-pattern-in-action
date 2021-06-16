package com.mickjoust.demo.jdp.chp3.a32_state;

import com.sun.java.swing.action.StateChangeAction;

/**
 * @author mickjoust
 */
public class Context {

    private State currentState;

    public Context(State currentState) {

        this.currentState = currentState;

        if (null == currentState) {
            this.currentState  = StateA.instance();
        }
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void request(){
        currentState.handle(this);
    }
}
