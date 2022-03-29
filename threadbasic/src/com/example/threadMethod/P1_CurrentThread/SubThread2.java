package com.example.threadMethod.P1_CurrentThread;

/**
 * @Author Hejiale
 * @Date 2022/3/26 8:42 PM
 * @Version 1.0
 */
public class SubThread2 extends Thread{
    public SubThread2(){
        System.out.println("构造方法中 hread.currentThread().getName():"+ Thread.currentThread().getName() );
        System.out.println("构造方法中 this.getName()" + this.getName());
    }
    @Override
    public void run() {
        System.out.println("run方法中 hread.currentThread().getName():"+ Thread.currentThread().getName() );
        System.out.println("run方法中 this.getName()" + this.getName());
    }
}
