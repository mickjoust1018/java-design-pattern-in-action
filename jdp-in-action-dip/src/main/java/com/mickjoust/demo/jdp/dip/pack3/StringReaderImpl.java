package com.mickjoust.demo.jdp.dip.pack3;

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
