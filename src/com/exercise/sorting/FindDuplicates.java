package com.exercise.sorting;

public class FindDuplicates {
    public static void main(String[] args) {
        int i = 0;
        int[] nums ={1,3,4,2,2};
        while(i < nums.length){
            int index = nums[i] - 1;
            /*
            Allowing the elements of an array which are not equal to its index + 1 value
            * */
            if(i+1 != nums[i]){
                // if the index value is not equal to array element,
                // then index may have a jumbled number or it may have a duplicate value
                if(nums[i] != nums[index]){
                    swap(nums,i,index);
                }else{
                    System.out.println(nums[i]);
                    break;
                }
            }else{
                i++;
            }
        }
    }
    static void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
