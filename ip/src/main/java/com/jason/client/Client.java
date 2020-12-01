package com.jason.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
//        创建socket，其实是开启实现io的虚拟接口(此接口不是Java中的接口，而是类似网线的插槽)
//        指定数据接收方发的IP地址和 端口号
        Socket client = new Socket("localhost", 10086);
//        获取输出流对象，向服务端发送数据
        OutputStream outputStream = client.getOutputStream();
//       将输出流对象进行包装
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
//        传输数据
        dataOutputStream.writeUTF("hello，陈诚");
//        关闭流操作
        dataOutputStream.close();
        outputStream.close();
        client.close();


    }
}
