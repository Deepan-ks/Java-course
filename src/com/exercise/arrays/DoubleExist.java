package com.exercise.arrays;

public class DoubleExist {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        int i=0,j=0;
        for(i =0;i<arr.length-1; i++){
            for(j = 0; j<arr.length-1; j++){
                if(i!=j && arr[i]==(2*arr[j])){
                    System.out.println(arr[i]+" "+arr[j]+" true");
                }
            }
        }
        System.out.println(arr[i]+" "+arr[j]);
    }
}
