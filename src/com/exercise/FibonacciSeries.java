package com.exercise;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int n=input.nextInt();
        int a=0;
        int b=1;
        int count=2;

        while(count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
