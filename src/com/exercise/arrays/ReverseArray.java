package com.exercise.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements for array");
        for (int i = 0; i < size; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("reversed array : "+ Arrays.toString(reverseArray(arr,size)));

    }

    static int[] reverseArray(int[] arr, int size) {
        int first =0;
        int last = size-1;

        while(first<last){
            swapArray(arr,first,last);
            first++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    static void swapArray(int[] arr2,int first, int last){
        int temp = arr2[first];
        arr2[first]=arr2[last];
        arr2[last]=temp;
    }

}
