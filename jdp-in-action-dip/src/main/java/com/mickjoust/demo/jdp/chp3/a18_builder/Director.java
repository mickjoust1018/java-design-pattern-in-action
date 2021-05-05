package com.mickjoust.demo.jdp.chp3.a18_builder;

/**
 * @author mickjoust
 **/
public class Director {

    public void construct(Builder builder) {
        builder.buildPartA(1);
        builder.buildPartB("test-test");
        builder.buildPartC(2);
    }

    public static void main(String[] args) {
        Director director = new Director();

        Builder builder = new ConcreteBuilder();

        director.construct(builder);

        System.out.println(builder.getResult());
    }

}
