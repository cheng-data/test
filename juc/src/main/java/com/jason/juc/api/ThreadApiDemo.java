package com.jason.juc.api;

public class ThreadApiDemo implements Runnable {
    public static void main(String[] args) {

//        获取当前线程名称
        Thread thread = Thread.currentThread();
//        获取当前线程名称
        System.out.println(thread.getName());
//        获取线程id
        System.out.println(thread.getId());
//        获取线程的优先级，一般为0-10的值，如果未经过设置，默认值为5
        System.out.println(thread.getPriority());

        /**
         * 设置线程池的优先级
         *      优先级越高，不一定跃先执行，只是先执行概率越高
         */
        thread.setPriority(2);
        System.out.println(thread.getPriority());

        ThreadApiDemo threadApiDemo = new ThreadApiDemo();
        Thread t1 = new Thread(threadApiDemo);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "------" + i);
        }
        System.out.println(t1.isAlive());
    }


    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "=====" + i);
        }
    }
}
