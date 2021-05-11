package com.mickjoust.demo.jdp.chp3.a21_protype;

/**
 * @author mickjoust
 */
public enum ModelType {

    MOVIE("movie"),
    EBOOK("eBook");

    private String name;

    ModelType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
