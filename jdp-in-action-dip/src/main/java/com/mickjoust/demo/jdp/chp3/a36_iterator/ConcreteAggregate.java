package com.mickjoust.demo.jdp.chp3.a36_iterator;



/**
 * @author mickjoust
 */
public class ConcreteAggregate implements Aggregate{

    private Object[] objects;

    public ConcreteAggregate(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(objects);
    }

}
