package com.mickjoust.demo.jdp.chp1.a03_layer;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author mickjoust
 * xxx
 **/
public class Demo {

    public static void main(String[] args) throws IOException {
        //创建连接
        URL url = new URL("http://xxx.test.com/sayHello");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();
        //发送数据
        OutputStream os = connection.getOutputStream();
        os.write("Hello World!".getBytes("UTF-8"));
        //接收响应
        InputStream is = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        //......
        br.close();
        is.close();
        os.close();
        //关闭连接
        connection.disconnect();
    }

}
