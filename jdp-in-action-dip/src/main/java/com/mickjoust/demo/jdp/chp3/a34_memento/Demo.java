package com.mickjoust.demo.jdp.chp3.a34_memento;

/**
 * @author mickjoust
 */
public class Demo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setId("1");
        originator.setName("mickjoust");
        originator.setPhone("1234567890");

        System.out.println(originator);

        Memento memento = originator.create();

        originator.setName("修改");

        System.out.println(originator);

        originator.restore(memento);

        System.out.println(originator);

    }
}
