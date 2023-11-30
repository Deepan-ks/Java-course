package com.exercise.sorting;
//Given an unsorted integer array nums, return the smallest missing positive integer.
public class FirstMissingPositive {
    public static void main(String[] args) {
        int i = 0;
        int[] nums = {3,4,-1,1};
        while(i < nums.length){
            int index = nums[i] - 1;
            //ignore negative, number greater than N & nums[i] == index value of element
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[index]){
                swap(nums,i, index);
            }else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                System.out.println(j+1);
            }
        }
        //System.out.println(nums.length + 1);
    }

    static void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
