package com.learn;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2};
        bubbleSorting(arr);
    }

    static void bubbleSorting(int[] arr){

        for (int i = 0; i < arr.length; i++) { // i is equal to no of pass
            int flag = 0;
            // arr.length - i = decreases the array limit from the last index;
            // after 1st iteration, arr = {1,3,2,4,5} // no need to check 5, next time so j<3
            // after 2nd iteration, arr = {1,3,2,4,5} // next time, so j = [0,1,2,3]
            // after 3rd iteration, arr = {1,2,3,4,5}// next time, so j = [0,1,2]
            for(int j=1;j< arr.length-i;j++){
                // swapping the previous element with adjacent element if it is lesser
                //{1.3.5,4,2}
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = 1; //
                }
            }
            //loop will break if there's no swapping which means the array is sorted
            if(flag == 0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
