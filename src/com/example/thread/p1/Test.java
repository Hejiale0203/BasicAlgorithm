package com.example.thread.p1;


/**
 * @Author Hejiale
 * @Date 2022/3/26 7:54 PM
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("java虚拟机启动main线程,main线程执行main方法");
        //创建子线程兑现
        MyThread myThread = new MyThread();
        //启动线程
        myThread.start();
        /**
         * 调用线程的start方法来启动线程
         * 启动线程的实质就是请求JVM运行相应的线程
         * 这个线程具体在什么时候运行由线程调度器(Scheduler)决定
         * 注意:
         *      start()调用结束并不意味着子线程开始运行
         *      新开启的线程会进行run()方法
         *      如果开启了多个线程,start()调用的顺序并不一定就是线程启动的顺序
         *      多线程运行结果与代码执行顺序或调用顺序无关
         */
        System.out.println("这是main线程后面的代码");
    }
}

