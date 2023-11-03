package com.exercise.searching;

import java.util.Scanner;
// floor - the greatest number in an array which is lesser or equal to the target
// Arr = [2,3,5,9,14,16,18] target = 15 ; answer : 14 (14 is the greatest number in an array but lesser or equal to target)
public class FloorBS {
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

        int res = floor(arr, target);
        System.out.println("index value:" +res);

    }

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
        return end;
    }
}
