package Study.P1;

import java.util.*;

/**
 *
 * equals
 *
 * @Author Hejiale
 * @Date 2022/3/27 10:58 PM
 * @Version 1.0
 */
public class Hshcode_equals {
    public static void main(String[] args) {
        String aaa = "111";
        String bbb = "111";
        System.out.println("使用.equals =="+aaa.equals(bbb));
        System.out.println("如果使用==  " + (aaa == bbb));


        System.out.println("使用Hashcode"+ aaa.hashCode());
        System.out.println("使用Hashcode"+ bbb.hashCode());

    }
}
