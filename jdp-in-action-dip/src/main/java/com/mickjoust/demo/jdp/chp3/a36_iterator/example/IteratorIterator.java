package com.mickjoust.demo.jdp.chp3.a36_iterator.example;

/**
 * @author mickjoust
 */
public interface IteratorIterator<E> {

    void reset();       //重置为第一个元素
    E next();           //获取下一个元素
    E currentItem();    //检索当前元素
    boolean hasNext();  //判断是否还有下一个元素存在.

}