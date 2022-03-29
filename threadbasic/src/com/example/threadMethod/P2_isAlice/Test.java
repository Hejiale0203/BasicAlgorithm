package com.example.threadMethod.P2_isAlice;

/**
 *
 * 测试线程的活动状态
 * @Author Hejiale
 * @Date 2022/3/26 9:01 PM
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        SubThread3 thread3 = new SubThread3();
        System.out.println("begin ==  " + thread3.isAlive());
        thread3.start();
        //结果不确定
        System.out.println("end == " + thread3.isAlive());
    }
}
