package com.hackerrank.test.challenging;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by jackalhan on 2/13/17.
 */
public class Time_Complexity_Primality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for (int a0 = 0; a0 < p; a0++) {
            // SOLUTION 1
            /*
             BigInteger n = BigInteger.valueOf(in.nextInt());
            System.out.println((n.isProbablePrime(5)) ? "Prime" : "Not prime");
            */
            // SOLUTION 2
            boolean isPrime = true;
            int n = in.nextInt();
            if (n == 1) {
                isPrime = false;
            } else if (n > 2 && n % 2 == 0) {
                isPrime = false;
            } else {
                int sqrtLimit = (int) Math.sqrt(n);
                for (int i = 3; i <= sqrtLimit; i += 2) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }

}
