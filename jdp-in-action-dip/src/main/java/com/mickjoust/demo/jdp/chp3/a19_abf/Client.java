package com.mickjoust.demo.jdp.chp3.a19_abf;

public class Client {

    private Chair myChair;
    private Sofa mySofa;
    private Table myTable;

    public Client(AbsractFactory af){
        myChair = af.createChair();
        mySofa = af.createSofa();
        myTable = af.createTable();
    }
}
