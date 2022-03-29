package Java.Sort;

import java.util.Arrays;

/**
 * @Author Hejiale
 * @Date 2022/3/30 12:09 AM
 * @Version 1.0
 *
 * 选择排序
 *      思路:
 *          每次遍历未排序部分, 把最小的元素放在未排序的索引位置
 *      平均时间复杂度: O(n²)
 *      选择排序一般快于冒泡排序,因为其交换次数少
 *      但如果集合有序度高,冒泡优于选择排序
 *      选择排序属于不稳定排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{85, 108, 6, 88, 66, 75, 57, 143, 112,
                136, 34, 82, 23, 5, 120, 60, 41, 24, 97,
                16, 121, 20, 135, 50, 15, 25, 105, 134,
                49, 130, 38, 126};
        //选择排序
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] a){
        int l = a.length;
        int target = a[0];
//        int n = 0;// 用来记录最小索引
        // j表示
        for (int j = 0; j < l - 1; j++) {
            int n = j;
            // i表示每轮选择最小元素要交换到的目标索引
            for (int i = j + 1; i < l; i++) {
                if(target > a[i]){
                    target = a[i];
                    n = i;
                }
            }
            //判断需不需要交换
            if(n != j){
                a[n] = a[j];
                a[j] = target;
                target= a[j+1];
            }

        }
    }

    public static void selectionSort_new(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            int s = i;
            for (int j = s + 1; j < a.length; j++) {
                if(a[s] > a[j]){
                    s = j;
                }
            }
            if(s != i){
                swap(a,s,i);
            }
        }
    }


    //如果前面的值比后一个值大 则交换位置
    public static void swap(int[] arr, int i, int j){
        int target = arr[j];
        arr[j] = arr[i];
        arr[i] = target;
    }
}
