package com.jason.juc.threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(String[] args) {

        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(3);
        System.out.println(System.currentTimeMillis());
        threadPool.schedule(new Runnable() {
            public void run() {
                System.out.println("延迟执行3秒");
                System.out.println(System.currentTimeMillis());
            }
        },3, TimeUnit.SECONDS);
        threadPool.shutdown();



    }


}
