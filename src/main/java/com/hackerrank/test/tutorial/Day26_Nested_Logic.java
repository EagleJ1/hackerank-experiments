package com.hackerrank.test.tutorial;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/26/17.
 */
public class Day26_Nested_Logic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int actualDay = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();
        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();
        scanner.close();
        int fine = 0;

        if (actualYear < expectedYear) {
            fine = 0;
        } else if (actualYear == expectedYear) {
            if (actualMonth < expectedMonth) {
                fine = 0;
            } else if (actualMonth == expectedMonth) {
                if (actualDay <= expectedDay) {
                    fine = 0;
                } else {
                    fine = 15 * (actualDay - expectedDay);
                }
            } else {
                fine = 500 * (actualMonth - expectedMonth);
            }
        } else {
            fine = 10000;
        }
        //Result
        System.out.println(fine);

    }
}
