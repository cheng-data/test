package com.jason.juc;

public class RunnableDemo  implements  Runnable{
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "============" + i);
        }
    }


    public static void main(String[] args) {

        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();

        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() +  "-----" + i);
        }
    }
}
