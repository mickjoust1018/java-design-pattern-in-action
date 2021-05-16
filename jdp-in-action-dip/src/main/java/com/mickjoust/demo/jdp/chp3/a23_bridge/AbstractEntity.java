package com.mickjoust.demo.jdp.chp3.a23_bridge;

/**
 * @author mickjoust
 **/
public abstract class AbstractEntity {

    //行为对象
    protected AbstractBehavior myBehavior;

    //实体与行为的关联
    public AbstractEntity(AbstractBehavior aBehavior) {
        myBehavior = aBehavior;
    }

    //子类需要实现的方法
    public abstract void request();

}
