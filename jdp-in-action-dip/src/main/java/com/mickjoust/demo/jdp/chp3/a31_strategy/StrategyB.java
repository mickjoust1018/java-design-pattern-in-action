package com.mickjoust.demo.jdp.chp3.a31_strategy;

/**
 * @author mickjoust
 */
public class StrategyB implements Strategy {
    @Override
    public void operation() {
        System.out.println("=== 执行策略 B ......");
    }
}
