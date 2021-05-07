package com.mickjoust.demo.jdp.chp3.a19_abf;

public class ChinaFactory extends AbsractFactory {

    @Override
    Chair createChair() {
        return new ChinaChair();
    }

    @Override
    Sofa createSofa() {
        return new ChinaSofa();
    }

    @Override
    Table createTable() {
        return new ChinaTable();
    }
}
