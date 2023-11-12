package com.exercise.searching;

import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] nums = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 10;
        System.out.println(Arrays.toString(targetSearch(nums,target)));
    }

    static int[] targetSearch (int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length - 1 && col >= 0){
            if(target == arr[row][col]){
                return new int[]{row, col};
            }else if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
