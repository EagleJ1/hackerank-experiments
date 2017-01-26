package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/26/17.
 */
public class StairCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        StairCase(_n);

    }

    static void StairCase(int n) {

        //*****#
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (n - i >= j)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();

        }
    }
}
