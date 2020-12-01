package com.jason.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

//        服务端需要使用server socket来开放本地的端口
        ServerSocket serverSocket = new ServerSocket(10086);
//        接受client传输的数据，需要定义socket对象
        Socket server = serverSocket.accept();
//        通过server获取输入流对象
        InputStream inputStream = server.getInputStream();
//        对输入流做包装，DataInputStream
        DataInputStream dataInputStream = new DataInputStream(inputStream);
//        读取对应的数据
        String s = dataInputStream.readUTF();
        System.out.println(s);

//        关闭所有流操作
        dataInputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();


    }



}
