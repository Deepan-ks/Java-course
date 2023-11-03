package com.exercise.searching;

import java.util.Scanner;
//ceiling - The Smallest number in an array which is greater or equal to target
// Arr = [2,3,5,9,14,16,18] target = 15 ; answer : 16 (16 is the smallest number in an array but greater or equal to target)
public class CeilingBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();

        System.out.println("Enter the array elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the target");
        int target = input.nextInt();

        int res = ceiling(arr, target);
        System.out.println("index value:" +res);

    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        // if target is greater than the greatest number in the array, return -1
        if(target > arr[end]) {
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start)/2;

            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
