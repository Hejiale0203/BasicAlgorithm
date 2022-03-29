package com.example.threadMethod.P4_GetId;

import com.example.threadMethod.P3_sleep.SubThread4;

/**
 * @Author Hejiale
 * @Date 2022/3/26 9:41 PM
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("main线程的name == "+ Thread.currentThread().getName() +" id == " +Thread.currentThread().getId());
        for (int i = 0; i < 50; i++) {
            SubThread5 subThread5 = new SubThread5();
            subThread5.start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
