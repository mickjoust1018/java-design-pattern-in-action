package com.mickjoust.demo.jdp.chp2.a09;

/**
 * @author mickjoust
 **/
public class PaperBoy {
    public void charge(Customer myCustomer, float payment) {
        payment = 2f; // “我要收取2元!”
        float paidAmount = myCustomer.pay(payment);
        if (paidAmount == payment) {
            // 说声谢谢，欢迎下次光临
        } else {
            // 可以稍后再来
        }
    }
}
