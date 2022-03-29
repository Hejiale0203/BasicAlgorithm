package com.example.threadMethod.P6_Setpriority;

/**
 * @Author Hejiale
 * @Date 2022/3/26 10:11 PM
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        t1.setPriority(1);
        ThreadB t2 = new ThreadB();
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
