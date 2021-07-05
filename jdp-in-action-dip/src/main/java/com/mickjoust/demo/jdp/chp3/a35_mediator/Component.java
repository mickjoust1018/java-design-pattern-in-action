package com.mickjoust.demo.jdp.chp3.a35_mediator;

import java.util.Map;

/**
 * @author mickjoust
 */
public abstract class Component {

    private Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void exec(String text);

    public Mediator getMediator() {
        return mediator;
    }

}
