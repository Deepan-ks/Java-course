package com.exercise.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class CountEvenDigits {
    public static void main(String[] args) {
        int[] arr ={18, 234, 550, 1576,4};
        System.out.println("No of even digits in array: "+ evenDigits(arr));

    }

    static int evenDigits(int[] arr){
        int evenCount=0;
        for (int i = 0; i < arr.length; i++) {
            int ans=countDigits(arr[i]);
            if(ans%2==0)
                evenCount++;
        }
        return evenCount;
    }

    static int countDigits(int num){
        int digit=0;
        while(num>0){
            digit++;
            num/=10;
        }
        return digit;
    }
}
