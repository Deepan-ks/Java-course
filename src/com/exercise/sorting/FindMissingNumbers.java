package com.exercise.sorting;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int i = 0;
        int[] nums = {4,3,2,7,8,2,3,1};

        while(i < nums.length){
            int index = nums[i] - 1;
            if(nums[i] != nums[index]){
                swap(nums,i,index);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j = 0;j < nums.length; j++){
            if(j+1 != nums[j]){
                ans.add(j+1);
            }
        }
        System.out.println(ans);
    }
    static void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
