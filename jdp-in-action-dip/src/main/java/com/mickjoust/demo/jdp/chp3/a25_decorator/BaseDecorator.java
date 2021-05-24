package com.mickjoust.demo.jdp.chp3.a25_decorator;

/**
 * @author mickjoust
 **/
public class BaseDecorator implements Component {
    private Component wrapper;
    public BaseDecorator(Component wrapper) {
        this.wrapper = wrapper;
    }
    @Override
    public void excute() {
        wrapper.excute();
    }
}
