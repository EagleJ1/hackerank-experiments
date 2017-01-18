package com.hackerrank.test.tutorial;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/15/17.
 */

/*
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20 , print Weird
If n is even and greater than 20 , print Not Weird

 */
public class Day3_Intro_To_Conditional_Statements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if (
                    (n >= 2) && (n <= 5)
                    ) {
                ans = "Not Weird";
            } else if
                    (
                    (n >= 6) && (n <= 20)
                    ) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }

        }
        System.out.println(ans);
    }
}
