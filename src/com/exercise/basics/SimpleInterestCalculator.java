package com.exercise.basics;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        int rate = input.nextInt();
        System.out.print("Enter the time period: ");
        int time = input.nextInt();

        double SimpleInterest = (principal*rate*time)/100;
        System.out.println("the simple interest: "+SimpleInterest);
    }
}
