package Study.P1;

import java.util.HashMap;

/**
 *
 * @Author Hejiale
 * @Date 2022/3/28 12:07 AM
 * @Version 1.0
 */
public class HashMap_impletes {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("zhangsan","2"); //把Entry对象("zhangsan","2")放入数组
        String result = map.put("zhangsan","2");
        System.out.println(result);

    }
}
