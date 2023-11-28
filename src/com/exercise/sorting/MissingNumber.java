package com.exercise.sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        /* O to N so, index equals to its value
          sorted nums = {0,1,3}; N = 3;
         sorted index = [0,1,2]; */
        int index = 0;
        while(index<nums.length){
            /*
            ignoring the elements greater than N, because there's no index for N
            nums = {3,0,1}; N = 3;
            index= [0,1,2]; no equivalent index for number 3
            */
            //index equal to its element value, if not swap numbers
            if(nums[index]<nums.length && nums[index]!=index){
                swap(nums,nums[index],index);

            }else{
                index++;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                System.out.println(i);
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

