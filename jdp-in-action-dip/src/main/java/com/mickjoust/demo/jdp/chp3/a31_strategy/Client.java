package com.mickjoust.demo.jdp.chp3.a31_strategy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author mickjoust
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Path inFile = Paths.get("/User/hjf/test.txt");

        File outFile = new File("testoutfile");

        Compressor gzipCompressor = new Compressor(new GzipCompressionStrategy());
        gzipCompressor.compress(inFile, outFile);

        Compressor zipCompressor = new Compressor(new ZipCompressionStrategy());
        zipCompressor.compress(inFile, outFile);
    }
}
