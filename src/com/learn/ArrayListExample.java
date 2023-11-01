package com.learn;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10);

        //adding elements inside arraylist
        list.add(12);
        list.add(43);
        list.add(65);
        list.add(99);
        list.add(123);
        list.add(467);
        list.add(42);
        list.add(65);
        //printing values
        System.out.println(list);

        //modifying the data 99-> 1000
        list.set(3,1000);
        //remove element in the 0th index
        list.remove(0);
        //using enhanced for loop
        for(int l: list){
            System.out.print(l+" ");
        }
        /*
        internal working
         arraylist expands its size when if it's size occupied more than 50%
         by creating a new arraylist with increased size and copy the old arraylist to new arraylist here.
         delete the old arraylist
        */
    }
}
