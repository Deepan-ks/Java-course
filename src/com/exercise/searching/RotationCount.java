package com.exercise.searching;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,7,1,2,3};
        int pivot = countRotation(arr);
        System.out.println("array rotated "+(pivot+1)+" times");
    }

    static int countRotation(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if( mid > start && arr[mid] < arr[mid - 1]){
                return  mid - 1;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }


}
