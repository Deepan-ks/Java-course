package com.exercise.searching;

import java.util.Scanner;

public class SearchRange {
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
        int search = input.nextInt();
        System.out.println("Enter a start range");
        int start = input.nextInt();
        System.out.println("Enter end range");
        int end = input.nextInt();
        if(start<arr.length && end<arr.length && start<end){
            System.out.println(linearSearch(arr,search, start,end));
        }else {
            System.out.println("Enter valid start and end range");
        }
    }

    static String linearSearch(int[] nums, int target,int start, int end){
        for(int i=start;i<=end;i++){
            if(nums[i]==target){
                return "Element is present";
            }
        }
        return "Element is not present";
    }
}
