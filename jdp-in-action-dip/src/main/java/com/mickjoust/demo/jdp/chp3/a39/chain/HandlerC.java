package com.mickjoust.demo.jdp.chp3.a39.chain;

/**
 * @author mickjoust
 */
public class HandlerC implements Handler{

    private Handler next;

    public HandlerC() {
    }

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("HandlerC 执行 代码逻辑，处理："+request.getData());
        if (null != next) {
            next.handle(request);
        } else {
            System.out.println("执行中止！");
        }
    }

}
