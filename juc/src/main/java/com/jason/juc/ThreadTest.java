package com.jason.juc;

public class ThreadTest extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "----" + i);
        }
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+ "=====" + i);
        }


    }

}
