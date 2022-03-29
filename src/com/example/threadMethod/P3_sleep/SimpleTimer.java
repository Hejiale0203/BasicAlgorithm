package com.example.threadMethod.P3_sleep;

/**
 * 使用线程休眠Thread.sleep() 完成一个简易的计时器
 * @Author Hejiale
 * @Date 2022/3/26 9:31 PM
 * @Version 1.0
 */
public class SimpleTimer {
    public static void main(String[] args) {
        //从60s开始计时
         int remaining = 10;
         //读取main方法的参数
        if(args.length == 1){
            remaining = Integer.parseInt(args[0]);
        }
         while (true){
             System.out.println("Remaining:" + remaining);
             remaining--;
             if(remaining < 0){
                 break;
             }
             try {
                 Thread.sleep(1000); //线程休眠
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
        System.out.println("Done!");
    }
}
