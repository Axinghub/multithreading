package com.axing.chapter1;

public class TryConcurrency {
    //利用线程同时操作
    public static void main(String[] args) {
        Thread t1 = new Thread("read_Thread"){
            @Override
            public void run(){
                readFromDataBase();
            }
        };
        t1.start();
        //匿名线程
        new Thread("write_read"){
            @Override
            public void run(){
                writeDataToFile();
            }
        }.start();
    }


    private static void readFromDataBase() {
        //read data from database and handle it.
        try {
            println("开始从数据库读取数据");
            Thread.sleep(1000 * 30L);
            println("读取完成的数据并开始处理它。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        println("读数据处理完成并成功");
    }

    private static void writeDataToFile() {
        try {
            println("开始将数据写入文件");
            Thread.sleep(1000 * 20L);
            println("写数据并开始处理它");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        println("写数据处理完成并成功");
    }

    private static void println(String message) {
        System.out.println(message);
    }
}
