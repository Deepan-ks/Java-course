package com.learn;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = input.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter a search element");
        int element = input.nextInt();
        System.out.println("search element: "+ linearSearch2(arr,element)+" is present at the index: "+linearSearch(arr,element));


    }

    static int linearSearch(int[] nums, int target){
        for(int index=0; index<nums.length; index++){
            if(nums[index]==target)
                return index;
        }
        return -1;
    }

    static int linearSearch2(int[] nums, int target){
        for(int i: nums){
            if(i==target)
                return i;
        }
        return Integer.MAX_VALUE; // returns max value because -1/0 may exist in the array
    }
}
