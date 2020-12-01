package com.jason.juc.pc2;


public class Consumer implements Runnable {

    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            goods.get();

        }

    }
}
