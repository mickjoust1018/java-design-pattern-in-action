package com.mickjoust.demo.jdp.chp2.a13_dip.pack1;


/**
 * @author mickjoust
 **/
public class StringProcessor { //具体类

    private final StringReader stringReader; //具体类
    private final StringWriter stringWriter; //具体类

    public StringProcessor(StringReader stringReader, StringWriter stringWriter) {
        this.stringReader = stringReader;
        this.stringWriter = stringWriter;
    }

    public void readAndWrite() {
        stringWriter.write(stringReader.getValue());
    }

    //测试用例
    public static void main(String[] args) {
        StringReader sr = new StringReader();
        sr.read("1111111");
        StringWriter sw = new StringWriter();
        StringProcessor sp = new StringProcessor(sr,sw);
        sp.readAndWrite();
    }

}
