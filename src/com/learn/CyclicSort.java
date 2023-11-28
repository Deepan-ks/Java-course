package com.learn;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        //cyclic sort is applicable when the range is 1 to N
        int[] arr = {4,3,2,7,8,2,3,1};
        int index = 0;
        while (index<arr.length){
            int correctIndex = arr[index] - 1;
            /* arr[index] iterate through the array of elements;
             arr[correctIndex] has value of index + 1 number;
             if correctIndex = 2 , arr[correctIndex] = 3; index 2 should hold value of 3*/
            if(arr[index] != arr[correctIndex]){
                index++;
            }else{
                swap(arr,index,correctIndex);
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
