package com.mickjoust.demo.jdp.chp3.a25_decorator.sample;

import com.mickjoust.demo.jdp.chp3.a25_decorator.sample.DataLoader;

import java.io.*;

/**
 * @author mickjoust
 **/
public class BaseFileDataLoader implements DataLoader {

    private String filePath;

    public BaseFileDataLoader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() {
        char[] buffer = null;
        File file = new File(filePath);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buffer);
    }

    @Override
    public void write(String data) {
        File file = new File(filePath);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
