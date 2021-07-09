package com.mickjoust.demo.jdp.chp3.a39.chain;

/**
 * @author mickjoust
 */
public class HandlerA implements Handler{

    private Handler next;

    public HandlerA() {
    }

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("HandlerA 执行 代码逻辑，处理："+request.getData());
        request.setData(request.getData().replace("AB",""));
        if (null != next) {
            next.handle(request);
        } else {
            System.out.println("执行中止！");
        }
    }

}
