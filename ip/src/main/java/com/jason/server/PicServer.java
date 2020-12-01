package com.jason.server;

import sun.security.acl.AclEntryImpl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PicServer {

    public static void main(String[] args) throws IOException {

//        创建服务端对象   开放端口
        ServerSocket serverSocket = new ServerSocket(10086);
//        创建服务端的socket、、
        Socket server = serverSocket.accept();
//        获取输入流对象
        InputStream inputStream = server.getInputStream();
//        创建文件输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("qige.jpg");
        int temp = 0;
        while ((temp = inputStream.read()) != -1){
            fileOutputStream.write(temp);
        }
        server.shutdownInput();
//        上传图片结束之后，给与客户端相应
        OutputStream outputStream = server.getOutputStream();
        outputStream.write("上传成功".getBytes());
        System.out.println();
        server.shutdownOutput();

//
        outputStream.close();
        fileOutputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();
    }

}
