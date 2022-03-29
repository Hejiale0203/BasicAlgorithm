package com.example.threadMethod.P8_daemon;

/**
 * @Author Hejiale
 * @Date 2022/3/26 10:35 PM
 * @Version 1.0
 */
public class SubThread8 extends Thread{
    @Override
    public void run() {
        super.run();
        while(true){
            System.out.println("sub thread: .........");
        }
    }
}
