package com.mickjoust.demo.jdp.chp3.a32_state.example;



/**
 * @author mickjoust
 */
public class Client {
    public static void main(String[] args) {
        PackageContext ctx = new PackageContext(null, "Test123");

        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
