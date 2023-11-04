package com.exercise.searching;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1};
        int target = 2;
        int peak = peakNumber(arr);
        System.out.println("Peak Number: "+arr[peak]);
        int asc  = orderAgnostic(arr,target,0,peak);
        if(asc!=-1){
            System.out.println("smallest index of target :"+asc);
        }else{
            int dsc = orderAgnostic(arr, target, peak, arr.length-1);
            System.out.println("smallest index of target :"+dsc);
        }
    }
    static int peakNumber(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    static int orderAgnostic(int[] arr, int target, int start, int end){
        boolean iAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(iAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}