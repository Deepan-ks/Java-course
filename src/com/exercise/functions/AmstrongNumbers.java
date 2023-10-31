package com.exercise.functions;

import java.util.Scanner;

public class AmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = input.nextInt();
        int count = countDigits(num);
        long value = powerOfDigits(num, count);
        if(num==value)
            System.out.println("It is an amstrong number");
        else
            System.out.println("it is not an amstrong number");
    }
    static  int countDigits(int num){
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }

    static int powerOfDigits(int num, int count){
        int value=0,lastDigit=0,power=0;
        while(num!=0){
            lastDigit=num%10;
            power = (int) Math.pow(lastDigit,count);
            //System.out.println(power);
            value+=power;
            num/=10;
        }
        return value;
    }
}
