package com.mickjoust.demo.jdp.chp3.a31_strategy;


/**
 * @author mickjoust
 */
public class FullReduceStrategy implements PromotionStrategy {


    @Override
    public int recommand(String skuId) {
        System.out.println("=== 执行 满减活动");
        //推荐算法和逻辑写这里
        return 1;
    }
}
