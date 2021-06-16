package com.mickjoust.demo.jdp.chp3.a31_strategy;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author mickjoust
 */
public class GzipCompressionStrategy implements CompressionStrategy{
    @Override
    public OutputStream compress(OutputStream data) throws IOException {
        return new GZIPOutputStream(data);
    }
}
