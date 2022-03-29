package com.example.thread.p2;

/**
 * 演示线程运行结果的随机性
 * @Author Hejiale
 * @Date 2022/3/26 8:02 PM
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();

        myThread2.start();
        //当前是main线程
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("main:" + i);
                int time = (int) Math.random() * 1000;
                //线程睡眠单位是毫秒 1s等于1000毫米
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
