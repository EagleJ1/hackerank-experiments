package com.hackerrank.test.tutorial;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 1/25/17.
 */
public class Day25_Running_Time_Complextiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfItems = scanner.nextInt();
        for (int i = 0; i < numOfItems; i++) {
            int num = scanner.nextInt();
            if (num == 0 || num == 1) {
                System.out.println("Not prime");
            } else {
                //if (num)
                boolean isPrime = true;
                for (int j = num; j >= 1; j--) {
                    if (num != j && j != 1) {
                        if (num % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime)
                    System.out.println("Prime");
                else
                    System.out.println("Not prime");

            }

        }

        scanner.close();
    }

}
