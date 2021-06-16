package com.mickjoust.demo.jdp.chp3.a31_strategy;

/**
 * @author mickjoust
 **/
public class Demo {
    public static void main(String[] args) {
        Context context = new Context();

        //使用第一个策略
        context.request(new StrategyA());

        System.out.println("====================");

        //使用第二个策略
        context.request(new StrategyB());
    }
}
