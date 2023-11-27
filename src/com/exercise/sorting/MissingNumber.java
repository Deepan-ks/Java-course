package com.exercise.sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int i = 0;
        while(i<nums.length){
            if(nums[i]<nums.length && nums[i]!=i){
                swap(nums,nums[i],i);

            }else{
                i++;
            }
        }

        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j){
                System.out.println(j);
            }
        }
        System.out.println(nums.length);
    }

    static void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }

}

