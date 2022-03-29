package com.example.threadMethod.P1_CurrentThread;

/**
 * @Author Hejiale
 * @Date 2022/3/26 8:44 PM
 * @Version 1.0
 */
public class Teat02CurrentThread {
    public static void main(String[] args) throws InterruptedException {
        //创建子线程对象
        SubThread2 t2 = new SubThread2();
        t2.setName("t2");     //设置线程名称
        t2.start();

        Thread.sleep(500); //main线程睡眠500ms
        //ThreadRunnable形参是Runnable接口,调用时传递的实参时接口的实现类对象
        Thread t3 = new Thread(t2);
        t3.start();
    }
}
