package com.mickjoust.demo.jdp.chp3.a25_decorator;

/**
 * @author mickjoust
 **/
public class BaseDecorator implements Component {

    private Component wrappe;

    public BaseDecorator(Component wrappe) {
        this.wrappe = wrappe;
    }

    @Override
    public void excute() {
        wrappe.excute();
    }
}
