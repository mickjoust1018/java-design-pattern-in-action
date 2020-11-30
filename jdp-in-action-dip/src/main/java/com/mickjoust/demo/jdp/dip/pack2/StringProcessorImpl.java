package com.mickjoust.demo.jdp.dip.pack2;



/**
 * @author mickjoust
 **/
public class StringProcessorImpl implements StringProcessor {

    @Override
    public void readAndWrite(StringReader stringReader, StringWriter stringWriter) {
        stringWriter.write(stringReader.getValue());
    }

    public static void main(String[] args){
        StringReader sr = new StringReader();
        sr.read("222222");
        StringWriter sw = new StringWriter();
        StringProcessor sp = new StringProcessorImpl();
        sp.readAndWrite(sr,sw);
    }
}
