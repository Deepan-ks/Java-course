package com.exercise.condtional;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        int max=0;

        if(a>max){
            max=a;
        }else max=b;

        if(c>max) max=c;

        System.out.println("the greatest number is:"+max);

       // System.out.println(Math.max(c,Math.max(a,b)));     using math function
    }
}
