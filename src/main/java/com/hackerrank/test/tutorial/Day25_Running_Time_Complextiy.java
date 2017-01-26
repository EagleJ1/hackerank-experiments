package com.hackerrank.test.tutorial;

import java.util.Map;
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
            if (num == 1) {
                System.out.println("Not prime");
            } else if (num > 2 && num % 2 == 0) {
                System.out.println("Not prime");
            } else {
                int top = (int) (Math.sqrt(num));
                //int counter = 0;
                boolean isPrime = true;
                for (int j = 3; j <= top; j += 2) {
                    //counter++;
                    if (num % j == 0) {
                        isPrime = false;
                        break;

                    }
                }
                if (isPrime)
                    System.out.println("Prime");
                else
                    System.out.println("Not prime");
                //System.out.format(" => %d checks", counter );

            }

        }

        scanner.close();
    }

}
