package com.example.threadMethod.P2_isAlice;

/**
 * @Author Hejiale
 * @Date 2022/3/26 9:01 PM
 * @Version 1.0
 */
public class SubThread3 extends Thread{

    @Override
    public void run() {
        System.out.println("run方法,isAlive = " + this.isAlive());
    }
}
