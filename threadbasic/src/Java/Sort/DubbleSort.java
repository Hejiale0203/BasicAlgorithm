package Java.Sort;

import java.util.Arrays;

/**
 * @Author Hejiale
 * @Date 2022/3/29 11:02 PM
 * @Version 1.0
 *
 * 冒泡排序
 *      思路 循环遍历
 *              每次循环表示需要进行多少次比较
 *              如果前面的值比后一个值大 则交换位置
 *      平均时间复杂度: O(n²)
 *      选择排序一般快于冒泡排序,因为其交换次数少
 *      但如果集合有序度高,冒泡优于选择排序
 *      冒泡排序属于稳定排序
 */
public class DubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{85, 108, 6, 88, 66, 75, 57, 143, 112,
                136, 34, 82, 23, 5, 120, 60, 41, 24, 97,
                16, 121, 20, 135, 50, 15, 25, 105, 134,
                49, 130, 38, 126};
        dubbleSort(arr);

    }
    // 最终优化
    public static void dubbleSort(int[] arr){
        int sum = 0;
        int n = arr.length - 1; //用于
        for (int j = 0; j < arr.length - 1; j++) {
            int last = 0; //表示最后一次交换发生的索引位置
            /**
             * 一轮排序
             * 优化 i<arr.length - 1 ==> i<arr.length - j - 1
             * 因为经过一次冒泡排序 最大的值已经移动到数组最右侧 所以下一次 不需要比较最后的值了
             */
            for (int i = 0; i < n ; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr,i,i+1);
                    last = i;
                }
                // sum表示循环次数
                sum++;
            }
            // 没有产生交换 代表本次是比较的是有序的 退出循环
            if(n == 0){
                break;
            }
            n = last;
            System.out.println("这是第"+ j + "轮排序"+ Arrays.toString(arr));
        }

//        System.out.println(sum);
    }


    public static void dubbleSort_one(int[] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            boolean swapped = false; //是否产生了交换 利用swapped优化
            /**
             * 一轮排序
             * 优化 i<arr.length - 1 ==> i<arr.length - j - 1
             * 因为经过一次冒泡排序 最大的值已经移动到数组最右侧 所以下一次 不需要比较最后的值了
             */
            for (int i = 0; i < arr.length - j -1 ; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr,i,i+1);
                    swapped = true;
                }
                // sum表示循环次数
                sum++;
            }
            // 没有产生交换 代表本次是比较的是有序的 退出循环
            if(!swapped){
                break;
            }
            System.out.println("这是第"+ j + "轮排序"+ Arrays.toString(arr));
        }
        System.out.println(sum);
    }
    //如果前面的值比后一个值大 则交换位置
    public static void swap(int[] arr, int i, int j){
        int target = arr[j];
        arr[j] = arr[i];
        arr[i] = target;
    }
}
