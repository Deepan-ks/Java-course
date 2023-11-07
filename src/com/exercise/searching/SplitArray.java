package com.exercise.searching;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int m = 1;
        int ans = sumSplitArray(arr, m);
        System.out.println(ans);
    }

    static int sumSplitArray(int[] arr, int m){
        int start =-1;
        int end = 0;
        for(int i =0; i< arr.length; i++){
            if(start < arr[i]){
                start = arr[i];
            }
            end += arr[i];
        }
        while(start < end){

            int mid = start + (end - start) / 2;
            int sum = 0;
            int subArray = 1;
            for(int num : arr){
                if(sum + num > mid){
                    sum = num;  //reseting the sum
                    subArray++; // counting the arrays
                }else{
                    sum+=num;
                }
            }

            if(subArray > m){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
