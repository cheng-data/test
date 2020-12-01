package com.jason.juc.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 30; i++) {

            threadPool.execute(new Task());
        }

        threadPool.shutdown();
    }


}
