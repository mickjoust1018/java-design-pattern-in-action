package com.mickjoust.demo.jdp.chp3.a19_abf;

/**
 * @author mickjoust
 */
public class USAFactory extends AbsractFactory{

    @Override
    Chair createChair() {
        return new USAChair();
    }

    @Override
    Sofa createSofa() {
        return new USASofa();
    }

    @Override
    Table createTable() {
        return new USATable();
    }

}
