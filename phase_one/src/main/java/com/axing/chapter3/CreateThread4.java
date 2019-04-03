package com.axing.chapter3;

public class CreateThread4 {

    private static int counter = 1;
//限制一个线程栈的大小
    public static void main(String[] args) {

        Thread t1 = new Thread(null, new Runnable() {
            @Override
            public void run() {
                try {
                    add(1);
                } catch (Error e) {
                    System.out.println(counter);
                }
            }

            private void add(int i) {
                counter++;
                add(i + 1);
            }
        }, "Test", 0);
        t1.start();
    }
}
