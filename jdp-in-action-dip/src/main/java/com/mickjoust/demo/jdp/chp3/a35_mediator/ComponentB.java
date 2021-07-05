package com.mickjoust.demo.jdp.chp3.a35_mediator;

/**
 * @author mickjoust
 */
public class ComponentB extends Component{

    public ComponentB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void exec(String key) {
        System.out.println("===在组件B中，通过中间者的操作");
        getMediator().apply(key);
    }

}
