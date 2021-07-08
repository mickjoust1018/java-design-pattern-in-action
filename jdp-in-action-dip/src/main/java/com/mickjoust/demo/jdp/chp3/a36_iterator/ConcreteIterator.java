package com.mickjoust.demo.jdp.chp3.a36_iterator;



/**
 * @author mickjoust
 */

public class ConcreteIterator implements Iterator {

    private Object[] objects;
    private int position;

    public ConcreteIterator(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public Object next() {
        return objects[position++];
    }

    @Override
    public boolean hasNext() {
        if(position >= objects.length) {
            return false;
        }
        return true;
    }

}
