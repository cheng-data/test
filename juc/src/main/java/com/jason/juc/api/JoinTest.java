package com.jason.juc.api;

public class JoinTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread t1 = new Thread(myRun);
        t1.start();

        for (int i = 0; i < 8; i++) {
            System.out.println(Thread.currentThread().getName() + "=======" + i);

            if (i % 3 == 2){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


        }

    }


}
