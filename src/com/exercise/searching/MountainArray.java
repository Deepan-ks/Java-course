package com.exercise.searching;

public class MountainArray {
    public static void main(String[] args) {
/*
     mountain array type -> increasing & decreasing pattern
                    21
                45     3
            5           0
        1
*/
        int[] arr = {1, 5, 45, 21, 3,0};
        System.out.println("The peak element in an array is: "+arr[peakElement(arr)]);
    }

    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end -start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
