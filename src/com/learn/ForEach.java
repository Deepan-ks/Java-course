package com.exercise.loops;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num= input.nextInt();
        int[] arr =new int[num];
        for(int i=0; i<num;i++){
            System.out.println("Enter a value for array");
            arr[i]=input.nextInt();
        }
        System.out.println("array values are:");
        for (int j : arr) {
            System.out.print(j);
        }
    }
}
