package com.exercise;

import java.util.Scanner;

public class SwitchDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to display the day of the week");
        int day = input.nextInt();
        // traditional switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a valid number");
                break;
        }
        /* using enhanced switch statement */
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("It is a weekday");
            case 6, 7 -> System.out.println("It is a weekend");
        }
    }
}
