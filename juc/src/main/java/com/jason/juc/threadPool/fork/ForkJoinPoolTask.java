package com.jason.juc.threadPool.fork;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;

public class ForkJoinPoolTask {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int[] arr = new int[100];
        Random random = new Random();
        int total = 0;
//        初始化100个数组元素
        for (int i = 0; i < arr.length; i++) {
            int temp = random.nextInt(20);
            total += (arr[i] = temp);
        }
        System.out.println("初始化数组总和：" + total);

        SumTask task = new SumTask(arr, 0, arr.length);
//        创建一个通用池，这是jdk1.8提供的功能
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Future<Integer> future = pool.submit(task);
        System.out.println("多线程执行结果：" + future.get());

    }


}
