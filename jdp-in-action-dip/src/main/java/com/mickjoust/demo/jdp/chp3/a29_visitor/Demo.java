package com.mickjoust.demo.jdp.chp3.a29_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mickjoust
 **/
public class Demo {
    public static void main(String[] args) {
        List<Element> elementList = new ArrayList<>();

        ElementA elementA = new ElementA();
        elementA.setAState(11);

        ElementB elementB = new ElementB();
        elementA.setAState(12);

        elementList.add(elementA);
        elementList.add(elementB);

        for (Element element :elementList) {
            element.accept(new VisitorBehavior());
        }
    }
}
