package com.jason.juc.pc3;

public class Test {

    public static void main(String[] args) {
        Goods goods = new Goods();

        Producer producer = new Producer(goods);

        Consumer consumer = new Consumer(goods);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

    }

}
