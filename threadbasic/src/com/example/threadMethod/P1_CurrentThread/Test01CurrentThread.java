package com.example.threadMethod.P1_CurrentThread;

/**
 * @Author Hejiale
 * @Date 2022/3/26 8:35 PM
 * @Version 1.0
 */
public class Test01CurrentThread {
    public static void main(String[] args) {
        System.out.println("main方法打印当前线程名称:"+ Thread.currentThread().getName());

        subThread1 thread1 = new subThread1();
//        thread1.start(); //子线程调用run() 所以run()中的当前线程是Thread-0这个子线程

        thread1.run();
        //在main方法中直接调用run方法,没有开启新的线程,所以在run()中的线程就是main线程
    }
}
