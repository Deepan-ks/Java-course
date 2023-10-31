package com.learn;

import java.util.Arrays;

public class PassingValue {
    public static void main(String[] args) {
        int a=10, b=20;
        //In Java, all arguments are passed by value.
        // When a primitive data type is passed as an argument to a function,
        // a copy of the value is created and passed to the function.
        value(a,b); //passing values
        System.out.println("after function "+a+" "+b);

        int[] arr ={100,200};
        //When a non-primitive data type is passed as an argument,
        // a copy of the reference to the object is created and passed to the function.
        funArr(arr);
        System.out.println("after function "+Arrays.toString(arr));
    }
    static void value(int a, int b){  //values are not changed for primitive data types in original
        a=15;
        b=25;
        //Any changes made to the value inside the function are not reflected outside the function.
        System.out.println("Inside function "+a+" "+b);
    }
    static void funArr(int[] arr){ //values are changed for array/string data types in original
        arr[0]=999;
        //Any changes made to the object inside the function are reflected outside the function
        //because both the original variable and the copy of the reference point to the same object in memory.
        System.out.println("Inside function "+arr[0]);
    }


}
