package com.mickjoust.demo.jdp.chp3.a18_builder;

/**
 * @author mickjoust
 **/
public interface Builder {

    void buildPartA(int partA);
    void buildPartB(String partB);
    void buildPartC(int partC);

    Product getResult();

}
