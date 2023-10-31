package com.exercise.functions;

import java.util.Scanner;

public class ListPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int first = input.nextInt();
        System.out.println("Enter a last number:");
        int end = input.nextInt();

       primeNumbers(first,end);

    }
    static void primeNumbers(int first, int end) {

        for ( int i=first; i<=end; i++){
            int c=2;
            int flag=0;
            while((c * c) <= i){
               if(i%c==0){
                    flag++;
                }
                c++;
            }
            if (flag == 0 && i>1){
                System.out.print(i+", ");
            }
        }

    }

}
