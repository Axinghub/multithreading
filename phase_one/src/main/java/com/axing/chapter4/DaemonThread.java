package com.axing.chapter4;


public class DaemonThread {
//守护线程
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " running");
                    Thread.sleep(100000);
                    System.out.println(Thread.currentThread().getName() + " done.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }; //new

        t.setDaemon(true);
        //runnable  ->running| ->dead| ->blocked

        t.start();

        Thread.sleep(5_000);   //JDK1.7
        System.out.println(Thread.currentThread().getName());
    }
}

/**
 * A<---------------------------------->B
 *  ->daemonThread(health check)
 * */