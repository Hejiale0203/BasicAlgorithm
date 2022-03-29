package Study.P1;

/**
 * @Author Hejiale
 * @Date 2022/3/27 12:49 PM
 * @Version 1.0
 */
public class StringBuilder_StringBuffer {
    public static void main(String[] args) {

        /**
         * String StringBuilder StingBuffer的区别
         */
        // 一般会采用StringBuilder 因为他的效率是最高的 , String每一次修改都会重新New新的对象 浪费内存
        // 如果系统是多线程并且多个线程都共享同一个变量的话 就需要采用 StringBuffer了 StringBuffer是经过sychonized方法修饰的
        // 执行效率的话StringBuilder>StringBuffer>String的

        StringBuffer a = new StringBuffer();
        StringBuilder b = new StringBuilder();
        System.out.println("获取StringBuffer的初始化容量 == "+ a.capacity());
        a.append("24e12");

        System.out.println("获取StringBuffer的初始化容量 == "+ a.capacity());

        b.append(471239);
        System.out.println(a+"   and   "+ b);
        a.insert(4,"NY");
        a.substring(b.charAt(4));
        System.out.println(a+"   and   "+ b);


    }

}
