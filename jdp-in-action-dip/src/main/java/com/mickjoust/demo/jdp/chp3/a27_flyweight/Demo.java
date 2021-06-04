package com.mickjoust.demo.jdp.chp3.a27_flyweight;

/**
 * @author mickjoust
 */
public class Demo {
    public static void main(String[] args) {
        Integer.valueOf("1");

        int outstate = 10;

        FlyweighFactory flyweighFactory = new FlyweighFactory();

        Flyweight flyweightA = flyweighFactory.getFlyweight("A");
        flyweightA.operation(-- outstate);

        Flyweight flyweightB = flyweighFactory.getFlyweight("B");
        flyweightB.operation(-- outstate);

        Flyweight flyweightD = flyweighFactory.getFlyweight("D");
        flyweightD.operation(-- outstate);

        Flyweight flyweightUX = flyweighFactory.getFlyweight("uX");
        flyweightUX.operation(-- outstate);

    }
}
