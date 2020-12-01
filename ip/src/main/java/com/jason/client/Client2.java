package com.jason.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws IOException {
//        创建客户端的套接字、
        Socket socket = new Socket("127.0.0.1", 10001);
//        --------------向外进行输出--------------
//        获取输出流对象
        OutputStream outputStream = socket.getOutputStream();
//        数据输出
        outputStream.write("hello java".getBytes());

//        接收服务端返回的消息
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int length = inputStream.read(buf);
        System.out.println("服务端的数据是：" + new String(buf,0,length));

//        关闭流操作
        inputStream.close();


    }
}
