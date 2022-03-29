package com.example.threadMethod.P7_interrupt;

/**
 * @Author Hejiale
 * @Date 2022/3/26 10:23 PM
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        SubThread8 t1 = new SubThread8();
        t1.start();

        //当前线程是main线程
        for (int i = 0; i < 100; i++) {
            System.out.println("main ==> " + i);
        }
        //中断子线程
        t1.interrupt(); //仅仅是给子线程标记中断,子线程没有真正的中断
    }
}
