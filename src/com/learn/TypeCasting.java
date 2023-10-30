package com.learn;

public class TypeCasting {
    public static void main(String[] args) {
        /* below are primitive datatypes */
        int i =10;
        byte b =34;
        float f = 45.34f;
        char c = 'A';
        double d = 123.45987;

        /*Java performs implicit conversion or widening conversion when one or more data types involved in conversion are compatible,
        or the value of a smaller data type is assigned to a bigger data type.
        Double is bigger than int,float,char,byte as it requires more storage space;
        hence, int,float,char,byte values are implicitly converted to double by Java.*/

        double result= (c*f) + (i/d) - b*b;
        System.out.println((c*f)+"  "+(i/d)+" "+(b*b));
        /* whole expression converted into double - because double is higher precedence */
        System.out.println(result);

        /*
        In Java, primitive data types are predefined by the language and named as reserved keywords.
        There are eight primitive data types in Java: boolean, byte, char, short, int, long, float, and double 1.

        The following table summarizes the primitive data types in Java:

        Table
        Data Type	Size	Default Value
        boolean	    1 bit	    false
        byte	    1 byte	     0
        char	    2 bytes	    ‘\u0000’
        short	    2 bytes	    0
        int	        4 bytes	    0
        long	    8 bytes	    0L
        float	    4 bytes	    0.0f
        double	    8 bytes	    0.0d
         */

    }
}
