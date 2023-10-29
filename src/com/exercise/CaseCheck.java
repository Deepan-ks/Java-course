package com.exercise;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        char ch = input.next().trim().charAt(0);
//            String s=input.next().trim();
//        System.out.println(s);
        if(ch>= 'a' & ch<='z') System.out.println("lowercase");
        else System.out.println("uppercase");
    }
}
