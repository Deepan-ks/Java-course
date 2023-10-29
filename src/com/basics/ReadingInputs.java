package com.basics;

import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=input.nextLine();
        System.out.println("Please enter your age: ");
        int age=input.nextInt();
        System.out.println("Please enter your grade: ");
        float grade=input.nextFloat();

        System.out.println("Name: "+name+" Age: "+age+" Grade: "+grade);
    }
}
