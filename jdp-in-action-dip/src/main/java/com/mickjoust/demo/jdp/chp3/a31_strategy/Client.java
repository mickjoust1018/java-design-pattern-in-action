package com.mickjoust.demo.jdp.chp3.a31_strategy;


/**
 * @author mickjoust
 */
public class Client {
    public static void main(String[] args) {
        Promotional fullReducePromotional = new Promotional(new FullReduceStrategy());
        fullReducePromotional.recommand("1122334455");

        Promotional nPriceDiscountPromotional = new Promotional(new NPriceDiscountStrategy());
        nPriceDiscountPromotional.recommand("6677889900");

        Promotional mSpikePromotional = new Promotional(new MSpikeStrategy());
        mSpikePromotional.recommand("11335577");

    }
}
