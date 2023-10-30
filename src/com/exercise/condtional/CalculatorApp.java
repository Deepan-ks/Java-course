package com.exercise.condtional;


import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("enter a operator:");
            char operator = input.next().trim().charAt(0);
            int result = 0;
            if ( operator =='+' || operator == '-' || operator == '*' || operator == '%'|| operator == '/'){
                System.out.println("Enter 2 numbers:");
                int a = input.nextInt();
                int b = input.nextInt();

                if(operator == '+') {
                    result=a+b;
                }
                if (operator == '-') {
                    result=a-b;
                }
                if (operator == '*') {
                    result=a*b;
                }
                if (operator == '%' && a != 0) {
                    result = a % b;
                }
                if(operator=='/') {
                    result=a/b;
                }
            } else if (operator == 'x'|| operator =='X') {
                break;
            }else {
                System.out.println("Invalid Operation!");
            }
            System.out.println("Answer: "+result);
        }
    }
}
