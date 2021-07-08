package com.mickjoust.demo.jdp.chp3.a36_iterator;

/**
 * @author mickjoust
 **/
public class Demo {
    public static void main(String[] args) {
        Object[] objects = new Object[2];
        objects[0] = new Object();
        objects[1] = new Object();

        Aggregate aggregate = new ConcreteAggregate(objects);

        Iterator iterator = aggregate.createIterator();

        while(iterator.hasNext()) {
            Object currentObject = iterator.next();
            System.out.println(currentObject.toString());
        }
    }
}
