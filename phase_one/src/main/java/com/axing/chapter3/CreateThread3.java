package com.axing.chapter3;


public class CreateThread3 {

    private int i = 0;

    private byte[] bytes = new byte[1024];

    private static int counter = 0;

    //JVM will create a thread named "main"
    public static void main(String[] args) {
        //create a JVM stack
        try {
            add(0);
        } catch (Error e) {
            e.printStackTrace();
            System.out.println(counter);
        }
    }

    private static void add(int i) {
        //随着栈帧的变大，可创建的栈帧个数变小
//        byte []b = new byte[1024*1024];
        ++counter;
        add(i + 1);
    }
}


//StackOverflowError
//21456