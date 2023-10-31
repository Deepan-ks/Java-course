package com.exercise.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter values for array");
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        System.out.println(Array);
    }
}
