package com.example.threadMethod.P7_interrupt;

/**
 * @Author Hejiale
 * @Date 2022/3/26 10:23 PM
 * @Version 1.0
 */
public class SubThread8 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            //判断线程的中断标志 isInterrupted(),该方法可以返回线程的中断标志
            if(this.isInterrupted() ){
                System.out.println("当前线程的中断标志位true,我要退出了");
                break;
            }
            System.out.println("sub thread --> " + i);


        }
        return;
    }
}
