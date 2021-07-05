package com.mickjoust.demo.jdp.chp3.a35_mediator;

/**
 * @author mickjoust
 */
public class ComponentA extends Component{

    public ComponentA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void exec(String key) {
        System.out.println("===在组件A中，通过中介者执行");
        getMediator().apply(key);
    }

}
