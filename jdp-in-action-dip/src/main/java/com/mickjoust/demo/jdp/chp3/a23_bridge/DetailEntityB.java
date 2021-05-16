package com.mickjoust.demo.jdp.chp3.a23_bridge;

/**
 * @author mickjoust
 **/
public class DetailEntityB extends AbstractEntity {

    public DetailEntityB(AbstractBehavior aBehavior) {
        super(aBehavior);
    }

    @Override
    public void request() {
        super.myBehavior.operation2();
    }

}
