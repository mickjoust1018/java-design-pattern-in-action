package com.mickjoust.demo.jdp.dip.pack3;


/**
 * @author mickjoust
 **/
public class StringProcessorImpl implements StringProcessor {

    @Override
    public void readAndWrite(StringReader stringReader, StringWriter stringWriter) {
        stringWriter.write(stringReader.getValue());
    }

    public static void main(String[] args) {
        StringReader sr = new StringReaderImpl();
        sr.read("333333");
        StringWriter sw = new StringWriterImpl();
        StringProcessor sp = new StringProcessorImpl();
        sp.readAndWrite(sr,sw);
    }
}
