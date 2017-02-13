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
            int n = in.nextInt();
            String result = "";
            for (int i = 0; i < Math.sqrt(n); i += 2) {
                if (i == 1 || i == 2) {
                    result = "Prime";
                } else {
                    if (i % 2 == 0) {
                        result = "Not prime";
                        break;
                    } else {
                        result = "Prime";
                    }
                }
            }

            System.out.println(result);


        }

    }
}
