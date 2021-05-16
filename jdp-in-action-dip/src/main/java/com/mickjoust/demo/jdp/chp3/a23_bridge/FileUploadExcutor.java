package com.mickjoust.demo.jdp.chp3.a23_bridge;

/**
 * @author mickjoust
 * 抽象行为
 **/
public interface FileUploadExcutor {

    Object uploadFile(String path);

    boolean checkFile(Object object);

    void deleteFile(Object object);
}
