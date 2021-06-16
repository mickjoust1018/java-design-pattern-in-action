package com.mickjoust.demo.jdp.chp3.a31_strategy;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author mickjoust
 */
public interface CompressionStrategy {
    OutputStream compress(OutputStream data) throws IOException;
}
