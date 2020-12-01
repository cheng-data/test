package com.jason.juc;

public class TicketRunnable implements Runnable {
    private int ticket = 5;

    public void run() {
        for (int i = 0; i < 100; i++) {
            if (ticket > 0)
                System.out.println(Thread.currentThread().getName() + " 正在出售第" + (ticket--) + "张票");
        }
    }

    public static void main(String[] args) {
        TicketRunnable ticketRunnable = new TicketRunnable();
        Thread t1 = new Thread(ticketRunnable);
        Thread t2 = new Thread(ticketRunnable);
        Thread t3 = new Thread(ticketRunnable);
        Thread t4 = new Thread(ticketRunnable);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
