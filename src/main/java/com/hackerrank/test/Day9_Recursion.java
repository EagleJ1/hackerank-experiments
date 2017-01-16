package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/15/17.
 */
public class Day9_Recursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));

    }

    static int factorial(int n)
    {
        return (n <= 1) ? 1 : n * factorial(n-1) ;
    }
}
