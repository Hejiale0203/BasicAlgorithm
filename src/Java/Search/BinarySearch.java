package Java.Search;

import java.util.Arrays;

import static Java.Sort.DubbleSort.dubbleSort;

/**
 * @Author Hejiale
 * @Date 2022/3/29 9:51 PM
 * @Version 1.0
 *
 * 二分查找:
 * 思路 先排序, 取中间值, 和目标值比较大小
 */
public class BinarySearch {
    public static void main(String[] args) {
        int target = 126;
        int[] arr = new int[]{85, 108, 6, 88, 66, 75, 57, 143, 112,
                136, 34, 82, 23, 5, 120, 60, 41, 24, 97,
                16, 121, 20, 135, 50, 15, 25, 105, 134,
                49, 130, 38, 126};
        int num = binarySearch(arr, target);
        int num1 = binarySearch_new(arr, target);
        System.out.println(num);
        System.out.println(num1);
    }

    public static int binarySearch(int[] a, int target) {
        //冒泡排序
        dubbleSort(a);
        //快速排序
        Arrays.sort(a);
        int right = a.length - 1;
        int left = 0;
        int mid;
        while (left <= right) {
            /**
             * right+left相加可能会超出整形范围 溢出
             * (right+left)/2 == right/2 + left/2 == left-left/2+right/2 == left + (right-left)/2
             */
            mid = (right + left) / 2;
            if (target == a[mid]) {
                return mid;
            } else if (target < a[mid]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return -1;
    }

    public static int binarySearch_new(int[] a, int target) {
        Arrays.sort(a);
        int right = a.length - 1;
        int left = 0;
        int mid;
        while (left <= right) {
            /**
             * right+left相加可能会超出整形范围 溢出
             * 采用位运算
             * mid = (left + right) >>>1
             */
            mid = (left + right) >>> 1;
            if (target == a[mid]) {
                return mid;
            } else if (target < a[mid]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return -1;
    }
}
