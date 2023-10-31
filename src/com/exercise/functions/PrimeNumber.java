package com.exercise.functions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        boolean result = prime(num);
        if (result) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It's not a prime number");
        }
    }
    static boolean prime (int num){
        int a = 2;
        while (a * a <= num) {
            if (num % a == 0)
                return false;
            a++;
        }
        if (a * a > num)
            return true;
        else
            return false;
        }
}
