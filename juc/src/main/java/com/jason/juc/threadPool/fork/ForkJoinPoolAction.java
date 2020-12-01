package com.jason.juc.threadPool.fork;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class ForkJoinPoolAction {

    public static void main(String[] args) throws InterruptedException {

        PrintTask printTask = new PrintTask(0, 300);

//        创建实例，并分割任务
        ForkJoinPool pool = new ForkJoinPool();

        pool.submit(printTask);
//        线程阻塞，等待所有任务完成
        pool.awaitTermination(2, TimeUnit.SECONDS);
        pool.shutdown();

    }

}
