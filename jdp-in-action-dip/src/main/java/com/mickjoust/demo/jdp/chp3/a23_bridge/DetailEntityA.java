package com.mickjoust.demo.jdp.chp3.a23_bridge;

/**
 * @author mickjoust
 **/
public class DetailEntityA extends AbstractEntity {

    public DetailEntityA(AbstractBehavior aBehavior) {
        super(aBehavior);
    }

    @Override
    public void request() {
        super.myBehavior.operation1();
    }

}
