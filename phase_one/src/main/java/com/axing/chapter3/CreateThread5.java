package com.axing.chapter3;

public class CreateThread5 {

    private static int counter = 1;
//测试可以创建的线程数量和stackSize的关系，但是老师死机
    public static void main(String[] args) {

        try {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                counter++;
                System.out.println(counter);
                new Thread(null,new Runnable() {
                    @Override
                    public void run() {
                        try {
//                            add(1);
                            Thread.sleep(60*1000*5);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
//                    private void add(int i) {
//
//                        add(i + 1);
//                    }
                },"Test", 1024*1024*10).start();
            }
        } catch (Error e) {
            e.printStackTrace();
            System.out.println(counter);
        }
        System.out.println("Total created thread nums=>" + counter);
    }
}
