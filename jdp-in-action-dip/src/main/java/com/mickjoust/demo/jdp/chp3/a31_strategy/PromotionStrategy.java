package com.mickjoust.demo.jdp.chp3.a31_strategy;


/**
 * @author mickjoust
 * 促销推荐场景
 */
public interface PromotionStrategy {

    /**
     * @param skuId
     * @return int
     * 返回1 代表 可以参加 满减活动
     * 返回2 代表 可以参加 N折优惠活动
     * 返回3 代表 可以参加 M元秒杀活动
     */
    int recommand(String skuId);

}
