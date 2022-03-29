package com.example.threadMethod.P5_yield;

/**
 * @Author Hejiale
 * @Date 2022/3/26 9:54 PM
 * @Version 1.0
 */
public class SubThread6 extends Thread{
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i <= 10000000; i++) {
            sum += i;
            Thread.yield();//线程让步,放弃CPU执行权
        }
        long end = System.currentTimeMillis();
        System.out.println("run方法运行时间" + (end - begin));
    }
}
