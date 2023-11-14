package com.learn;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i = 0; i< arr.length;i++){
            int last = arr.length - i - 1; //limit is decreasing as the maximum will be sent to last index.
            //after first iteration, arr will be = {3,1,2,4,5} no need to check the last index after that so its decreasing
            int max = getMaxIndex(arr,0,last); //get the maximum number's index
            swaping(arr,max,last); //swap the maximum element with last element

        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swaping(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
