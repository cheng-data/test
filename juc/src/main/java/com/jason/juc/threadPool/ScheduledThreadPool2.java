package com.jason.juc.threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool2 {

    public static void main(String[] args) {

        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(3);
        System.out.println(System.currentTimeMillis());
        threadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("1----延迟执行1秒，每3秒执行一次");
                System.out.println(System.currentTimeMillis());
            }
        },1,3, TimeUnit.SECONDS);

        threadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("2----延迟执行1秒，每3秒执行一次");
                System.out.println(System.currentTimeMillis());
            }
        },1,3, TimeUnit.SECONDS);

        threadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("3----延迟执行1秒，每3秒执行一次");
                System.out.println(System.currentTimeMillis());
            }
        },1,3, TimeUnit.SECONDS);

        threadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("4----延迟执行1秒，每3秒执行一次");
                System.out.println(System.currentTimeMillis());
            }
        },1,3, TimeUnit.SECONDS);
//        threadPool.shutdown();



    }


}
