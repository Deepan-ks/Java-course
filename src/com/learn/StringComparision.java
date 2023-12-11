package com.learn;

import java.util.ArrayList;
import java.util.Arrays;

public class StringComparision {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        // a & b are reference variable pointing to the same value;
        // reference variables are stored in stack memory and values are stored inside the string pool which is in the heap memory;
        System.out.println(a==b); // true
        //explicitly storing the values in separate string pools using new keyword
        String name1 = new String("john");
        String name2 = new String("john");
        //values are same, but stored in separate string pools which are inside the heap memory
        System.out.println(name1==name2); // false

        System.out.println("hello" + new int[]{2,3,4}); // converts object into string

        // '+' only works with primitive datatype only;
        System.out.println(new Integer(24) + "" + new ArrayList<>()); // complex datatype + "" +complex datatype works
      //  System.out.println(new Integer(24) + new ArrayList<>()); same code without string,
        // doesn't work because at least one string is required for '+' operator
    }
}
