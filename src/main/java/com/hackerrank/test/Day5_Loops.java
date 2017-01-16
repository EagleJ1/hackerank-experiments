package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/15/17.
 */
public class Day5_Loops {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i<=10; i++)
        {
            int result = i * n;
            System.out.format("%d x %d = %d \n", n, i, result);
        }
    }
}
