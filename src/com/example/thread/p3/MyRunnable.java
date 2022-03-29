package com.example.thread.p3;

/**
 * 当线程类已经由父类了 就不能用集成Thread类的形式来创建线程,
 * 可以实现Runnable接口的形式
 * 1)
 *
 * @Author Hejiale
 * @Date 2022/3/26 8:10 PM
 * @Version 1.0
 */
public class MyRunnable implements Runnable {
    //重写Runnable接口中的抽象方法run()
    //run()就是子线程要执行的代码
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程执行了"+i);
        }
    }
}
