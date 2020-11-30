package com.mickjoust.demo.jdp.dip.pack3;

/**
 * @author mickjoust
 **/
public class StringWriterImpl implements StringWriter {

    @Override
    public void write(String value) {
        System.out.println(value);
    }

}
