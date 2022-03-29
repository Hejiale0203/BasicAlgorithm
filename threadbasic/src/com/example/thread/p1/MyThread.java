package com.example.thread.p1;

/**
 * 定义继承类Thread
 * @Author Hejiale
 * @Date 2022/3/26 7:52 PM
 * @Version 1.0
 */
public class MyThread extends Thread{
    //重写Thread父类中的run方法
    //run()方法中的代码就是子线程要执行的任务
    @Override
    public void run() {
        System.out.println("这是子线程打印的内容");
        super.run();
    }
}
