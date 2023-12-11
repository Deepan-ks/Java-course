package com.learn;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        for(int i =0; i< 26; i++){
            char ch = (char) ('a' + i);
            str += ch;
            //  loop 1 : 'a' + i -> "a" ; loop 2 : "a" + i - > "a" + 'b' -> "ab"
            // "a", "ab", "abc", "abcd" ..... "a..z" -> creating new object and pointing to new object at next loop;
            // after "ab" created, "a" was not pointed by reference/object; leads to usage of more memory space;
            sb.append(ch);
            // StringBuilder don't create new object, instead do change the original object;
            // mutable like the arrays
        }
        System.out.println("String : "+ str);
        System.out.println("StringBuilder : "+ sb);
    }
}
