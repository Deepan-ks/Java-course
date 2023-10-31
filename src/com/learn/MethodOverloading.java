package com.learn;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Eneter pin:");
        int pin = input.nextInt();
        System.out.println("enter 1 to deposit money  |  enter 0 to skip: ");
        int res = input.nextInt();
        float amount = 0;
        if (res==1){
            System.out.println("Enter amount:");
            amount = input.nextFloat();
            showBalance(name, pin, amount);
        }else showBalance(name, pin);
    }
    static  void showBalance(String name, int pin, float amount){
        System.out.println("balance: "+(amount+5000));
    }
    static  void showBalance(String name, int pin){
        System.out.println("balance :"+5000);
    }
}
