package com.example.threadSafe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 演示线程原子性问题
 * @Author Hejiale
 * @Date 2022/3/26 11:52 PM
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        //启动两个线程,不断调用getNum()
        MyInt myInt= new MyInt();
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        System.out.println(Thread.currentThread().getName() + " -> " + myInt.getNum());
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();;
        }

    }
    static class MyInt1{
        /**
         * 自增操作实现的步骤:
         *  读取num的值
         *  num自增
         *  把自增的值赋值个num
         */
        int num;
        public int getNum(){
            return num++;
        }
    }
    //在java中提供了一个线程安全的AtomicInteger类,保证了操作的原子性
    static class MyInt{
        AtomicInteger num = new AtomicInteger();
        public int getNum(){
            return num.getAndIncrement();
        }
    }
}
