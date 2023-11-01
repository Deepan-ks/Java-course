package com.exercise.arrays;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements for array");
        for (int i = 0; i < size; i++) {
            arr[i]=input.nextInt();
        }

        System.out.println("Maximum of an array: "+max(arr));

    }
    static int max (int[] arr){
        int max=arr[0];
        for (int i: arr){
            if(i>max)
                max=i;
        }
        return  max;
    }
}
