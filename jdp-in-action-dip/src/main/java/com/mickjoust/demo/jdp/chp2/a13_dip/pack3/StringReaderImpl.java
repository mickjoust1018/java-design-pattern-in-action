package com.mickjoust.demo.jdp.chp2.a13_dip.pack3;

/**
 * @author mickjoust
 **/
public class StringReaderImpl implements StringReader {

    private String value;

    @Override
    public void read(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return null;
    }
}
