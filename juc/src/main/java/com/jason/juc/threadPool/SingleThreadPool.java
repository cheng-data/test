package com.jason.juc.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 20; i++) {
            executor.execute(new Task());
        }
        executor.shutdown();


    }
}
