package com.exercise.searching;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int pivot = findPivot(arr);
        int target = 1;
       System.out.println("Peak element is : "+arr[pivot]);
        int ans=0;
        if(pivot == -1){
            ans = binarySearch(arr,target,0,arr.length-1);
            System.out.println("the target element at index: "+ans);
        }
        else if(arr[pivot] == target){
            System.out.println("the target element at index: "+ans);
        }else if(arr[pivot] < target){
            ans = binarySearch(arr,target,0,pivot-1);
            System.out.println("the target element at index: "+ans);
        }else{
            ans = binarySearch(arr,target,pivot + 1,arr.length-1);
            System.out.println("the target element at index: "+ans);
        }
    }


    static  int binarySearch(int arr[], int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid]==target){
                return mid;
            }
            if (arr[mid] > target){
                end = mid -1;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start =  mid + 1;
            }
        }

        return -1;
    }
}
