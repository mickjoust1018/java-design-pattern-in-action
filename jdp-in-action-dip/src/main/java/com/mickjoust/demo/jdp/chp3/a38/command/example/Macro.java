package com.mickjoust.demo.jdp.chp3.a38.command.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mickjoust
 */
public class Macro {

    private final List<Action> actions;

    public Macro() {
        actions = new ArrayList<>();
    }

    public void record(Action action) {
        actions.add(action);
    }

    public void run() {
        actions.forEach(Action::perform);
    }

}
