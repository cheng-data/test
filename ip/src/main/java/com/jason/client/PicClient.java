package com.jason.client;

import java.io.*;
import java.net.Socket;

public class PicClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("测试.jpg");
//        创建socket
        Socket client = new Socket("localhost", 10086);
//        获取输出流对象
        OutputStream outputStream = client.getOutputStream();
        int temp = 0;
        while ((temp = fileInputStream.read()) != -1){
            outputStream.write(temp);
        }
        client.shutdownOutput();

//        客户端收到服务端的响应、、
        InputStream inputStream = client.getInputStream();
        byte[] buf = new byte[1024];
        int length = inputStream.read(buf);
        System.out.println(new String(buf,0,length));
        client.shutdownInput();

//        关闭操作
        inputStream.close();


        outputStream.close();
        fileInputStream.close();
        client.close();

    }
}
