package com.mickjoust.demo.jdp.chp3.a23_bridge;

/**
 * @author mickjoust
 * 抽象实体
 **/
public interface FileUploader {
    Object upload(String path);
    boolean check(Object object);
}
