package com.exercise.functions;

import java.util.Scanner;

public class VotingAge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println(AgeChecker(age));
    }

    private static String AgeChecker(int age) {
        if(age>=18)
            return "Eligible to vote!";
        else
            return "Not Eligible to vote!";
    }
}
