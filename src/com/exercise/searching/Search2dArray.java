package com.exercise.searching;

import java.util.Arrays;
import java.util.Scanner;

public class Search2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 45, 67},
                {54, 87, 26, 44},
                {98, 74, 36, 88},
                {53,2}
        };
        int target = 74;
        int[] ans = linearSearch(arr,target);
        System.out.println("index of the target [row,col]: "+Arrays.toString(ans));
    }
    static int[] linearSearch(int[][] arr, int target){
        for(int rows =0; rows< arr.length;rows++){
            for(int cols =0; cols < arr[rows].length; cols++){
                if(arr[rows][cols]==target)
                    return new int[]{rows,cols};
            }

        }
        return new int[]{-1,-1};
    }
}
