package com.learn;

import java.util.Arrays;

public class Vargs {
    public static void main(String[] args) {
        int rollNo = 100;
        String name = "john";
        studentReport(rollNo,name,93,93,93,99,99);

    }
    static void studentReport(int rollnum, String name, float ...marks){
        float total = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
        System.out.println("Student Report of "+name+" "+Arrays.toString(marks)+" total : "+total);
    }

}
