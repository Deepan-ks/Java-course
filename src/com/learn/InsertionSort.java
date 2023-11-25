package com.learn;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={-43, -1, -12, 0,39, 86, 56};
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[], int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}


