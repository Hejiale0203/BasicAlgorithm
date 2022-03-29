package com.example.threadMethod.P1_CurrentThread;

/**
 *
 * 定义一个线程类
 *      分别在构造方法中和run方法中打印当前线程
 * @Author Hejiale
 * @Date 2022/3/26 8:35 PM
 * @Version 1.0
 */
public class subThread1 extends Thread{
    public subThread1(){
        System.out.println("构造方法打印当前线程名称:"+ Thread.currentThread().getName());
    }


    @Override
    public void run() {
        System.out.println("run方法打印当前线程名称:"+ Thread.currentThread().getName());
    }
}
