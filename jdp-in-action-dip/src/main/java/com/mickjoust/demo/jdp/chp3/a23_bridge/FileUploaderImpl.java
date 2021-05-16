package com.mickjoust.demo.jdp.chp3.a23_bridge;

/**
 * @author mickjoust
 **/
public class FileUploaderImpl implements FileUploader {

    private FileUploadExcutor excutor = null;

    public FileUploaderImpl(FileUploadExcutor excutor) {
        this.excutor = excutor;
    }

    @Override
    public Object upload(String path) {
        return excutor.uploadFile(path);
    }

    @Override
    public boolean check(Object object) {
        return excutor.checkFile(object);
    }

}
