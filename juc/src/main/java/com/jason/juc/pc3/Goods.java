package com.jason.juc.pc3;

public class Goods {

    private String brand;
    private String name;

//    默认没有商品，值为true，则有商品
    private boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void set(String brand, String name){
//        当生产者抢占cpu资源之后会判断，当前对象是否有值，如果有，意味着消费者还没有消费
//        当前线程进入阻塞状态，等待消费者取走商品之后，再次生产
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了：" + this.brand + "====" + this.name);
//        如果代码执行到此处，意味着意味着已经生产完成，需将flag设置为true
        flag = true;
//        唤醒生产者进行生产
        notify();
    }

    public synchronized void get(){
        /**
         * 如果flag为false，生产者没有生产商品，消费者无法消费，消费者线程进入阻塞
         */
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("消费者取走了：" + this.getBrand() + "=====" + this.getName());
        flag = false;
//        唤醒进程
        notify();
    }


}
