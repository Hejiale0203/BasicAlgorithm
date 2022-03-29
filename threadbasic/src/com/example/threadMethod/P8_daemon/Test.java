package com.example.threadMethod.P8_daemon;

/**
 *
 * 设置守护线程
 * @Author Hejiale
 * @Date 2022/3/26 10:35 PM
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        SubThread8 t1 = new SubThread8();
        //设置线程为守护线程
        t1.setDaemon(true);  //设置守护线程的代码应该在线程启动前
        t1.start();
        //当前线程为main线程
        for (int i = 0; i <= 10; i++) {
            System.out.println("main == " + i);
        }
        //当main线程结束 守护线程t1也销毁了
    }
}
