package com.mickjoust.demo.jdp.chp3.a25_decorator.sample;

/**
 * @author mickjoust
 */
public class Demo {
    public static void main(String[] args) {
        String testinfo = "Name, testinfo\nMia, 10000\nMax, 9100";
        DataLoaderDecorator encoded = new CompressionDataDecorator(
                new EncryptionDataDecorator(
                        new BaseFileDataLoader("demo.txt")));
        encoded.write(testinfo);
        DataLoader plain = new BaseFileDataLoader("demo.txt");

        System.out.println("- 输入 ----------------");
        System.out.println(testinfo);
        System.out.println("- 加密+压缩 写入文件--------------");
        System.out.println(plain.read());
        System.out.println("- 解密+解压 --------------");
        System.out.println(encoded.read());
    }
}
