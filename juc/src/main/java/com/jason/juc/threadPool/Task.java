package com.jason.juc.threadPool;

public class Task implements Runnable{


    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is  running。");
    }
}
