package com.mickjoust.demo.jdp.chp3.a28_proxy;

/**
 * @author mickjoust
 * @author jingfeng.huang
 * @since 2021/6/7 16:38
 */
public class RealObjectImpl implements RealObject {

    @Override
    public void doSomething() {
        System.out.println("=== 真实对象输出打印");
    }

}
