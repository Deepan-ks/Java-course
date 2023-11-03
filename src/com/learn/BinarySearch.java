package com.learn;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={-12, -10, -7, -1, 0, 3, 15, 19, 23, 35, 67, 90, 110}; // ascending order
        int [] arr1 = {90, 65, 34, 13, 10, 8, -1, -12, -45}; // descending order
        int target = -1;
        int ans=0, ans2=0;
        ans = binarySearch(arr,target);
        ans2 = binarySearch2(arr1,target);
        System.out.println(target+" is present at index: "+ans);
        System.out.println(target+" is present at index: "+ans2);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;  // same as mid=( start + end ) / 2; but there might be a chance to exceed the int range.
            // condition to check if target is before middle element or after middle element  in an array
            if(target>arr[mid]){
                start = mid + 1;
            }
            else if ( target < arr[mid] ){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int binarySearch2(int[] arr1,int target){
        int start = 0;
        int end = arr1.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;  // same as mid=( start + end ) / 2; but there might be a chance to exceed the int range.
            // condition to check if target is before middle element or after middle element in an array
            if( target < arr1[mid] ){
                start = mid + 1;
            }
            else if ( target > arr1[mid] ){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
