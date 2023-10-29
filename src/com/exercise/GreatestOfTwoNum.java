package com.exercise;

import java.util.Scanner;

public class GreatestOfTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 integer numbers:");
        int a = input.nextInt();
        int b = input.nextInt();

        if(a>b)
            System.out.println(a+" is the greatest number");
        else
            System.out.println(b+" is the greatest number");
    }
}
