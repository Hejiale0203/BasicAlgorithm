package com.example.threadMethod.P3_sleep;

/**
 * @Author Hejiale
 * @Date 2022/3/26 9:07 PM
 * @Version 1.0
 */
public class SubThread4 extends Thread{
    @Override
    public void run() {
        System.out.println("线程"+Thread.currentThread().getName()+"启动 "+System.currentTimeMillis());

        try {
            Thread.sleep(2000);
            System.out.println("run,"+Thread.currentThread().getName()+"end ==" +System.currentTimeMillis());
        } catch (InterruptedException e) {
            //在子线程run方法中 如果有受检异常需要处理 只能选择捕获处理 不能抛出处理
            e.printStackTrace();
        }
    }
}
