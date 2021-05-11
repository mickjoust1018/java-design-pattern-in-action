package com.mickjoust.demo.jdp.chp3.a21_protype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mickjoust
 */
public class PrototypeFactory {

    //这里充当注册表的作用，用于存放原始对象
    private static Map<String, IPrototype> prototypes = new HashMap<>();

    //初始化时就将原始对象放入注册表中，作为对象拷贝的基础
    static {
        prototypes.put(ModelType.MOVIE.getName(), new Movie());
        prototypes.put(ModelType.EBOOK.getName(), new EBook());
    }

    //获取对象时，是使用name来进行对象拷贝
    public static IPrototype getInstance(final String s) throws CloneNotSupportedException {
        return prototypes.get(s).clone();
    }
}
