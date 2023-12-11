package com.exercise.string;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "a ";
        boolean res = palindrome(str);
        if(res){
            System.out.println("string is palindrome");
        }else{
            System.out.println("string is not palindrome");
        }
    }
    static boolean palindrome(String str){

        int start = 0;
        int end = str.length() - 1;
        while(start <= end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
