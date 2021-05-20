package com.mickjoust.demo.jdp.chp3.a21_protype;

public class Demo1 {

    public static void main(String[] args) throws CloneNotSupportedException {
        ProtypeA source = new ProtypeA();
        System.out.println(source);

        ProtypeA newInstanceA = source.clone();
        System.out.println(newInstanceA);
    }

}
