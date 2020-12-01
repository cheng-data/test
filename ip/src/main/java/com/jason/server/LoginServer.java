package com.jason.server;

import com.jason.client.User;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket = new ServerSocket(10001);
        while (true){
            Socket server = serverSocket.accept();
//        获取输入流对象
            InputStream inputStream = server.getInputStream();
//        需要使用Object Input Stream
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            User user = (User) objectInputStream.readObject();
            String str = "";

            if ("jason".equals(user.getUserName()) && "jason".equals(user.getPassword())){
                System.out.println("欢迎你：" + user.getUserName());
                str = "登陆成功";
            }else {
                str = "登陆失败";
            }
//        截断输入流
//            server.shutdownInput();
//        给客户端响应
            DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());
            dataOutputStream.writeUTF(str);
//            server.shutdownOutput();

            dataOutputStream.close();
            inputStream.close();
            server.close();
        }

//        serverSocket.close();

    }


}
