package com.example.threadMethod.P3_sleep;

/**
 * @Author Hejiale
 * @Date 2022/3/26 9:07 PM
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("线程启动之前" + System.currentTimeMillis());
        SubThread4 thread4 = new SubThread4();
        thread4.start();
        System.out.println("当前线程状态"+ thread4.isAlive() + System.currentTimeMillis());

    }
}
