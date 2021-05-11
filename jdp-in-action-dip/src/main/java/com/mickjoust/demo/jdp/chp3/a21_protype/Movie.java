package com.mickjoust.demo.jdp.chp3.a21_protype;

/**
 * @author mickjoust
 * 电影
 */
public class Movie implements IPrototype {

    //打印并拷贝对象
    @Override
    public Movie clone() throws CloneNotSupportedException {
        System.out.println("Cloning Movie object..");
        return (Movie) super.clone();
    }

    //方便结果展示
    @Override
    public String toString() {
        return "Movie{}";
    }

}
