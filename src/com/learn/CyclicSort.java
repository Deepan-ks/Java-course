package com.learn;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        //cyclic sort is applicable when the range is 1 to N
        int[] arr = {4,3,2,7,8,2,3,1};
        int i = 0;
        while (i<arr.length){
            if(arr[i]-1 == i){
                i++;
            }else{
                swap(arr,i,arr[i]-1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
