package com.example.thread.p3;

/**
 *
 * 测试实现Runnable接口的形式来创建线程
 * @Author Hejiale
 * @Date 2022/3/26 8:09 PM
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        MyRunnable runnable = new MyRunnable();
        //创建线程对象
        Thread thread =  new Thread(runnable);
        //启动线程
        thread.start();
        //当前是main线程
        for (int i = 0; i < 100; i++) {
            System.out.println("main执行了"+i);
        }
        //有时候调用Thread(Runnable)方式时,实参也会传递匿名内部类对象
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("thread1子线程执行了"+i);
                }
            }
        });
        thread1.start();

    }
}
