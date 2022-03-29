package com.example.threadMethod.P6_Setpriority;

/**
 * @Author Hejiale
 * @Date 2022/3/26 10:11 PM
 * @Version 1.0
 */
public class ThreadA extends Thread{
    @Override
    public void run() {
        long begin = System.currentTimeMillis();

        int sum = 0;
        for (long i = 0; i < 100000000000l; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("A线程执行了"+ (end - begin) +"秒");
    }
}
