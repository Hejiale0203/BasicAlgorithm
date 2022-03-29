package com.example.threadMethod.P5_yield;

/**
 * @Author Hejiale
 * @Date 2022/3/26 9:52 PM
 * @Version 1.0
 */
public class Test{
    public static void main(String[] args) {

        //开启子线程,计算累加和
        SubThread6 subThread6 = new SubThread6();
        subThread6.start();

        //当前在main线程中计算一个累加和
        long begin = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i <= 10000000; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("main方法运行时间" + (end - begin));
    }
}
