package com.mickjoust.demo.jdp.chp3.a23_bridge;

/**
 * @author mickjoust
 **/
public class Client {
    public static void main(String[] args) {
        String os = "linux";
        FileUploader uploader = null;

        switch (os) {
            case "windows":
                uploader = new FileUploaderImpl(new WindowsFileUpLoadExcutor());
                break;
            case "linux":
                uploader = new FileUploaderImpl( new LinuxFileUpLoadExcutor());
                break;
            default:
                System.out.println("OS not supported !!");
        }

        Object fileContent = uploader.upload("/User/hjf/.../path");
        System.out.println(uploader.check(fileContent));
    }
}
