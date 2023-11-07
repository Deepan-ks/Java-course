package com.exercise.searching;

public class RotatedDuplicatesArray {
    public static void main(String[] args) {
        int[] arr={};
        int ans = 0;
        int target = 0;
        int pivot = findPivotWithDuplicates(arr);
        if(pivot == -1){
            ans = binarySearch(arr,target,0,arr.length-1);

        }else if (target > pivot){
            ans = binarySearch(arr, target, pivot + 1, arr.length-1);
        }else{
            ans = binarySearch(arr,target,0,pivot-1);
        }
    }
    static  int binarySearch(int arr[], int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid -1;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid - 1;
            }
            // ignoring the duplicates by adjusting start & end (2],2,2,9,2,[2) and so on..
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end - 1;
                }
                end++;
            }
            // conditions to ensure the left side is sorted in ascending order
            else if (arr[start]< arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }else{
                end = end - 1;
            }
        }
        return - 1;
    }
}
