package com.mickjoust.demo.jdp.chp3.a27_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mickjoust
 * 享元工厂类
 */
public class FlyweighFactory {

    ///
    /// 定义一个池容器
    private Map<String,Flyweight> pool = new HashMap<>();

    public FlyweighFactory() {
        pool.put("A", new ConcreteFlyweight("A"));//将对应的内部状态添加进去
        pool.put("B", new ConcreteFlyweight("B"));
        pool.put("C", new ConcreteFlyweight("C"));
    }

    // 根据键来查找值
    public Flyweight getFlyweight(String key) {

        if (pool.containsKey(key)) {
            System.out.println("====享元池中有，直接复用，key："+key);
            return pool.get(key);
        } else {

            if (key.contains("u")) {
                System.out.println("====创建不共享的的对象，key："+key);
                return new UnsharedConcreteFlyweight(key);
            }

            System.out.println("====享元池中没有，重新创建并复用，key："+key);
            Flyweight flyweightNew = new ConcreteFlyweight(key);
            pool.put(key,flyweightNew);
            return flyweightNew;
        }

    }
}
