package com.example.thread.p2;

/**
 * @Author Hejiale
 * @Date 2022/3/26 8:03 PM
 * @Version 1.0
 */
public class MyThread2 extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("sub thread:" + i);
                int time = (int) Math.random() * 1000;
                //线程睡眠单位是毫秒 1s等于1000毫米
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
