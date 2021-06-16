package com.mickjoust.demo.jdp.chp3.a32_state;

/**
 * @author mickjoust
 */
public class Client {
    public static void main(String[] args) {
        DeliveryContext ctx = new DeliveryContext(null, "Test123");

        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
