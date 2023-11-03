package com.exercise.searching;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {-1, -1};
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int first = binarySearch(nums,target,true);
        int last = binarySearch(nums,target,false);
        arr[0]=first;
        arr[1]=last;
        System.out.println(Arrays.toString(arr));
    }

    static int binarySearch(int[] nums, int target, boolean firstOccurrence){
        int start =0;
        int end = nums.length - 1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                index = mid;
                if(firstOccurrence){

                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return index;
    }
}

