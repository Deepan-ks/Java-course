package com.exercise.basics;

import java.util.Scanner;

public class ArithmeticOps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 integer numbers to perform basic arithmetic operation");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("addition: "+(a+b));
        System.out.println("subtraction: "+(a-b));
        System.out.println("multiplication: "+(a*b));
        System.out.println("division: "+(a/b));
    }
}
