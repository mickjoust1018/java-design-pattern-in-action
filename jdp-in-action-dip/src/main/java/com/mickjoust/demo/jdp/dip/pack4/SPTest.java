package com.mickjoust.demo.jdp.dip.pack4;

import javax.annotation.Resource;

/**
 * @author mickjoust
 **/
public class SPTest {

    @Resource
    private StringProcessor sp;
    @Resource
    private StringReader sr;
    @Resource
    private StringWriter sw;

    public void main(String[] args) {
        sr.read("444444");
        sp.readAndWrite(sr,sw);
    }

}
