package com.exercise.loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        long num = input.nextLong();
        int reverseNum=0;
        while(num>0){
            int last=(int)num%10;
            reverseNum=reverseNum*10+last;
            num/=10;
        }
        System.out.println("Reversed Number: "+reverseNum);
    }
}
