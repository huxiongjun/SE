package com.hu;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/14 10:25
 * @description TODO
 */
public class Main08 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 5,};
        arr = getSortedK(arr,3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] getSortedK(int[] arr, int n) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp  = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
