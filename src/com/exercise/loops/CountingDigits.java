package com.exercise.loops;

import java.util.Scanner;

public class CountingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        long num=input.nextLong();
        System.out.println("Enter a digit to be counted:");
        int n=input.nextInt();
        int count=0;
        while(num>0){
            int digit= (int) (num%10);
            if(digit==n) count++;
            num/=10;
        }
        System.out.println("the occurrence of the digit "+n+" is: "+count);
    }
}
