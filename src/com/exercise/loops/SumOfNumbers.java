package com.exercise.loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sumOfEven=0, sumOfOdd=0, sumOfNegative=0;
        while (true){
            System.out.print("Enter a number:");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            if(num == 0) {
                break;
            }
            else if(num>0) {
                if (num % 2 == 0) {
                    sumOfEven += num;
                } else {
                    sumOfOdd += num;
                }
            }
            else if (num < 0 ) {
                sumOfNegative+=num;
            }
        }
        System.out.println("sum of positive even numbers: "+sumOfEven);
        System.out.println("sum of positive odd numbers: "+sumOfOdd);
        System.out.println("sum of negative numbers: "+sumOfNegative);

    }
}
