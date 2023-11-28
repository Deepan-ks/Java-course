package com.exercise.sorting;

import com.learn.Array;
//Find the number that occurs twice and the number that is missing and return them in the form of an array.
import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int index = 0;
        while(index < nums.length){
            int correct = nums[index] - 1;
            if(nums[index] != nums[correct]){
                swap(nums,index,correct);
            }else{
                index++;
            }
        }
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            if(i+1 != nums[i]){
                arr[0] = nums[i];
                arr[1] = i+1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
