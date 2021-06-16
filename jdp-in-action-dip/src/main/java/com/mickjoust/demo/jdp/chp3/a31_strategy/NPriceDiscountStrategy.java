package com.mickjoust.demo.jdp.chp3.a31_strategy;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

/**
 * @author mickjoust
 */
public class NPriceDiscountStrategy implements PromotionStrategy {

    @Override
    public int recommand(String skuId) {
        System.out.println("=== 执行 n折扣优惠活动");
        //推荐算法和逻辑写这里
        return 2;
    }

}
