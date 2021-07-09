package com.mickjoust.demo.jdp.chp3.a39.chain;

/**
 * @author mickjoust
 **/
public class Demo {
    public static void main(String[] args) {
        Handler h1 = new HandlerA();
        Handler h2 = new HandlerB();
        Handler h3 = new HandlerC();

        h1.setNext(h2);
        h2.setNext(h3);

        Request request = new Request();
        request.setData("请求数据ABCDE");

        h1.handle(request);
    }
}
