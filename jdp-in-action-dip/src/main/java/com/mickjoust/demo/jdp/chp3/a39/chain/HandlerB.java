package com.mickjoust.demo.jdp.chp3.a39.chain;

/**
 * @author mickjoust
 */
public class HandlerB implements Handler {

    private Handler next;

    public HandlerB() {
    }

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("HandlerB 执行 代码逻辑，处理："+request.getData());
        request.setData(request.getData().replace("CD",""));
        if (null != next) {
            next.handle(request);
        } else {
            System.out.println("执行中止！");
        }
    }

}
