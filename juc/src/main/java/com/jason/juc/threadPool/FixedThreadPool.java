package com.jason.juc.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 20; i++) {
            threadPool.execute(new Task());
        }

        threadPool.shutdown();


    }


}
