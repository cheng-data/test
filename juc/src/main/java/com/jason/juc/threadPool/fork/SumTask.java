package com.jason.juc.threadPool.fork;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 20;    //  每个小任务，最多只累加20个数
    private int arr[];
    private int start;
    private int end;

    /**累加从start 到 end 的 arry 数组
     * @param arr
     * @param start
     * @param end
     */
    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }


    @Override
    protected Integer compute() {
        int sum = 0;
//        当end与start之间的差小于threshold，开始进行实际的累加
        if (end - start < THRESHOLD){
            for (int i = start; i < end; i++) {
                System.out.println(Thread.currentThread().getName() + "的i值：" + arr[i]);
                sum += arr[i];
            }
            return sum;
        }else {
            int middle = (start + end) / 2;
            SumTask left = new SumTask(arr, start, middle);
            SumTask right = new SumTask(arr, middle, end);
            left.fork();
            right.fork();
//            两个小任务累加的结果合并起来
            return left.join() + right.join();
        }
    }
}





