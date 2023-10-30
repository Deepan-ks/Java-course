package com.exercise.condtional;
/* John is allowed to go out with his friends only on the even days of a given month.
Write a program to count the number of days he can go out in the month of August.*/

import java.util.Scanner;

public class CountingEvenNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month:");
        int month=input.nextInt();
        int days=0,even=0;
        switch (month){
            case 1,3,5,7,8,10,12 -> days=31;
            case 4,6,11 -> days =30;
            case 2 -> days=2;
            default -> System.out.println("Invalid Input!");
        }

        for (int i = 1; i <= days; i++){
            if( i%2 == 0){
                even++;
                System.out.print(i+", ");
            }
        }
        System.out.println(even+" days for the given month");

    }
}
