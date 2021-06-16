package com.mickjoust.demo.jdp.chp3.a31_strategy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author mickjoust
 */
public class Promotional {

    private final PromotionStrategy strategy;

    public Promotional(PromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void recommand(String skuId) {
        strategy.recommand(skuId);
    }

}
