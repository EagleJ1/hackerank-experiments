package com.hackerrank.test.tutorial;

/**
 * Created by txcakaloglu on 1/31/17.
 */
public class _Bitwise_General_Tutorial {

    public static void main(String[] args) {
        int a = 15;
        int b = 27;

        //15 = 0000 1111
        //27 = 0001 1011

        /* Binary AND Operator (&)
            15 = 0000 1111
            27 = 0001 1011
         + ----------------
            11 = 0000 1011
        */
        int and = a & b;

        /* Binary OR Operator (|)
            15 = 0000 1111
            27 = 0001 1011
         | ----------------
            31 = 0001 1111
         */

        int or = a | b;

        /* Binary XOR Operator (^)
            15 = 0000 1111
            27 = 0001 1011
          ^ ----------------
            20 = 0001 0100
        */
        int xor = a ^ b;

        /* Binary One Completement Operators (~)
            15 = 0000 1111
          ~ ----------------
           -16 = 0001 0000
        */
        int oneComplement = ~a;


        /* Binary Left Shift Operators (<<)
                   15 = 0000 1111
        Shifting 2 bits (adding two zeros to the right and move it to the 2 bits to the right)
                   60 = 0011 1100
         */
        int leftShift = a << 2;


        /* Binary Right Shift Operator (>>)
                   15 = 0000 1111
        Shifting 2 bits (adding two zeros to the left and move it to the 2 bits to the left)
                   3 =  0000 0011
         */
        int rightShift= a >> 2;

        /* Binary Right Shift zero fill Operator (>>>)
                   15 = 0000 1111
        Starting from left, sifted values filled with zeros 2 bits
                   3 =  0000 0011
         */
        int shiftRightZero = a >>> 2;


        System.out.println("AND Operators : " + and);
        System.out.println("OR Operators : " + or );
        System.out.println("XOR Operators : " + xor );
        System.out.println("One Complement Operators : " + oneComplement);
        System.out.println("Left Shift Operators : " + leftShift );
        System.out.println("Right Shift Operators : " + rightShift );
        System.out.println("Shift Right Zero Operators : " + shiftRightZero);
    }
}
