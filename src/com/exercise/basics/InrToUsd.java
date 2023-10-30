package com.exercise.basics;


import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in rupees:");
        float rupees=input.nextFloat();
        float one_usd=83.26f;
        float usd=rupees/one_usd;
        System.out.printf("USD $: %.2f", usd);

    }


}
