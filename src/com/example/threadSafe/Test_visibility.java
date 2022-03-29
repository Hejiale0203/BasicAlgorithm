package com.example.threadSafe;

import java.util.Random;

/**
 * 测试线程的可见性
 * @Author Hejiale
 * @Date 2022/3/27 12:41 AM
 * @Version 1.0
 */
public class Test_visibility {
    public static void main(String[] args) throws InterruptedException {
        Mytask task = new Mytask();
        new Thread(task).start();
        Thread.sleep(100);
        //主线程1s后取消子线程
        task.cancel();
        /**
         * 可能会出现以下情况:
         *      在main线程中调佣了task.cancel()方法,把task对象的toCancel变量修改为true
         *      可能会存在子线程看不到main线程对toCancel做的修改 在子线程冲toCancel变量一直为false
         *      导致子线程看不到main线程对toCancel更新的原因
         *          1) JIT即时编译器可能会对run方法中while进行优化为:
         *          if(!toCancel){
         *              while (true){
         *                if(doSomething()){
         *             }}}
         *          2)可能与计算机的存储系统有关,假设分别由两个cpu内核运行main线程与子线程,
         *            一个cpu内核无法立即读取另外一个cpu内核中的数据
         */
    }
    static class Mytask implements Runnable{
        private boolean toCanel = false;
        @Override
        public void run() {
            while (!toCanel){
                if(doSomething()){
                }
            }
            if(toCanel){
                System.out.println("任务被取消");
            }else {
                System.out.println("任务正常结束");
            }
        }
        private boolean doSomething(){
            System.out.println("执行某个任务");
            try {
                Thread.sleep(new Random().nextInt(100));   //模拟执行任务的时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }
        public void cancel(){
            toCanel = true;
            System.out.println("收到 取消线程的消息");
        }
    }
}
