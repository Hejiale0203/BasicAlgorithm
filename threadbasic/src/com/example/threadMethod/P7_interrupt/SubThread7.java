package com.example.threadMethod.P7_interrupt;

/**
 * @Author Hejiale
 * @Date 2022/3/26 10:23 PM
 * @Version 1.0
 */
public class SubThread7 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            System.out.println("sub thread --> " + i);
        }
    }
}
