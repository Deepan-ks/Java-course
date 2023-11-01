package com.learn;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrlist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        //initialization -> similar to initializing the rows in normal 2d array
        for (int i=0; i<3; i++){
            list.add(new ArrayList<>());  // [ x, x, x] -> created arraylist for each x, so that each x can store n elements in it.
        }

        for(int i=0; i<3; i++){
            for(int j =0; j<3; j++){
                list.get(i).add(input.nextInt());
            }
        }
        System.out.println(list);
    }
}
