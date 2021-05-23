package com.mickjoust.demo.jdp.chp3.a24_compostie.sample;

/**
 * @author mickjoust
 */
public class Demo {

    public static void main(String[] args) {
        AbstractNode rootNode = new Node();
        rootNode.setId(0);
        rootNode.setParentId(-1);

        AbstractNode node1 = new Node();
        node1.add(new Leaf());
        node1.add(new Leaf());

        rootNode.add(new Leaf());
        rootNode.add(new Leaf());
        rootNode.add(node1);


        System.out.println(node1.getId());
    }

}
