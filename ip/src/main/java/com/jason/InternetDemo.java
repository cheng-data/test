package com.jason;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetDemo {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);


        InetAddress byName = InetAddress.getByName("WIN-ABK81E17BFS");
        System.out.println(byName);
    }
}
