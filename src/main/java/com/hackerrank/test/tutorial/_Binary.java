package com.hackerrank.test.tutorial;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 1/31/17.
 */
public class _Binary {

    /*
       Binary to Convert

       Base 2 0100 => Base 10 4
       Sort reverse
       0 -> 0 * 2^0 = 0
       1 -> 0 * 2^1 = 0
       2 -> 1 * 2^2 = 4
       3 -> 0 * 2^3 = 0

       => RESULT : 4



     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number");
        long binaryNumber = scanner.nextLong(),
                digitToProcess = 1,
                result = 0,
                digitCounter = 0;
        scanner.close();

        while (binaryNumber > 0) {

            /*
            GET THE SEPERATE DIGITS FROM NUMBER
            int number;
                while (number > 0) {
                        print( number % 10);
                        number = number / 10;
                }

            ----------------------------------------------------
            this will give you the numbers in reverse order. You will need to push them onto a stack and pop them off in reverse order.
            Code to print the numbers in the correct order:
            ----------------------------------------------------
             int number; // = and int
             LinkedList<Integer> stack = new LinkedList<Integer>();
             while (number > 0) {
                 stack.push( number % 10 );
                 number = number / 10;
             }

             while (!stack.isEmpty()) {
                print(stack.pop());
             }
             */


            //reverse order so first digit is a digit of the at the end of the string.
            //get the next digit of binaryNumber that is alreadydivided by 10
            digitToProcess = binaryNumber % 10;
            result = (long) (result + (digitToProcess * Math.pow(2, digitCounter)));
            digitCounter++;
            // make the size of the binary number smaller 1 digit by 1 digit
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal: "  + result);
    }

}
