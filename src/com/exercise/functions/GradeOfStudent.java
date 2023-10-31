package com.exercise.functions;

import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks:");
        float mark = input.nextFloat();
        System.out.println("Grade :"+gradeCalc(mark));
    }
    static String gradeCalc(float mark){
        if(mark>=91 && mark<=100) return "O";
        if(mark>=81 && mark <=90 ) return "A";
        if(mark>=71 && mark <=80 ) return "B";
        if(mark>=61 && mark <=70 ) return "C";
        if(mark>=51 && mark <=60 ) return "D";
        if(mark>=41 && mark<=50 ) return "E";
        if(mark<40) return "FAIL";
        return null;
    }

}
