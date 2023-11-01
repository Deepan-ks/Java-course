package com.learn;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the rows:");
        int rows=input.nextInt();
        System.out.println("Enter size of the cols:");
        int cols=input.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i =0; i<rows;i++){
            System.out.println("enter elements for row "+i);
            System.out.println("enter elements for column "+i);
            for (int j = 0; j < cols ; j++) {
                arr[i][j]=input.nextInt();
            }
        }

       System.out.println("Printing Array elements:");
        for (int i =0; i<rows;i++){
            for (int j = 0; j < cols ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.println("printing arrays using enhanced for loop");
        // int [] - because we are accessing the arrays, not individual element which is int.
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
