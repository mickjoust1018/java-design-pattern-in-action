package com.mickjoust.demo.jdp.chp3.a25_decorator.sample;

import com.mickjoust.demo.jdp.chp3.a25_decorator.sample.DataLoader;

/**
 * @author mickjoust
 **/
public class DataLoaderDecorator implements DataLoader {

    private DataLoader wrapper;

    public DataLoaderDecorator(DataLoader wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String read() {
        return wrapper.read();
    }

    @Override
    public void write(String data) {
        wrapper.write(data);
    }
}
