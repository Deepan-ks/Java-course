package com.learn;

import java.util.Scanner;

public class BinarySearch1 {
    // Order Agnostic Binary Search
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element in ascending or descending order");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target element to search in an array");
        int target = input.nextInt();
        int res = orderAgnosticBS(arr,target);
        System.out.println(target+" present at the index: "+res);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //to find the array is sorted in ascending or descending
        boolean iAsc = arr[start] < arr[end];

        while(start<=end) {
            int mid = start + (end - start) / 2;  // same as mid=( start + end ) / 2; but there might be a chance to exceed the int range.

            if(arr[mid]==target){
                return mid;
            }

            if (iAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
