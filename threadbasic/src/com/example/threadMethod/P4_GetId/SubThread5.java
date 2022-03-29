package com.example.threadMethod.P4_GetId;

/**
 * @Author Hejiale
 * @Date 2022/3/26 9:41 PM
 * @Version 1.0
 */
public class SubThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("thread name = " + Thread.currentThread().getName() + "  id = " + this.getId());
    }
}
