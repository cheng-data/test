package com.jason.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class LoginClient {

    public static void main(String[] args) throws IOException {

        Socket client = new Socket("localhost", 10001);
        while (true) {
            OutputStream outputStream = client.getOutputStream();
//        完成登录功能，需要传输一个user对象、、
//        User user = new User("jason","jason");

            User user = getUser();
//        传输对象需要outPut Stream
            ObjectOutputStream stream = new ObjectOutputStream(outputStream);
            stream.writeObject(user);
//        调用shutdown方法告诉对方传输器完成、
//            client.shutdownOutput();


//        接收响应、

            DataInputStream dataInputStream = new DataInputStream(client.getInputStream());
            String str = dataInputStream.readUTF();
            System.out.println(str);
//            client.shutdownInput();

//        关闭流操作、
//            dataInputStream.close();
        }


    }

    public static User getUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        return new User(userName, password);
    }

}
