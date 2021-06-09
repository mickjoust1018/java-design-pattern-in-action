package com.mickjoust.demo.jdp.chp3.a28_proxy;

/**
 * @author mickjoust
 * @author jingfeng.huang
 * @since 2021/6/7 16:39
 */
public class Proxy extends RealObjectImpl {

    @Override
    public void doSomething() {
        //这里做一些操作
        System.out.println("== 通过代理类来执行真实对象");
        super.doSomething();
    }

}
