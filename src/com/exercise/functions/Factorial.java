package com.exercise.functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println("Factorial of a number "+num+" is: "+calFactorial(num));
    }
    static  long calFactorial(int num){
        if ( num==0 || num==1 ) return 1;
        else if ( num>=2 ) {
            long prod = 1;
            for (int i = 1; i <= num; i++)
                prod = prod * i;

            return prod;
        }
        return 0;
    }
}
