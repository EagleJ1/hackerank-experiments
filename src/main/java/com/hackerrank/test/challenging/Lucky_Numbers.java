package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 2/1/17.
 */
public class Lucky_Numbers {

    // 4 & 7

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String result = "";
        for (int a0 = 0; a0 < q; a0++) {
            long n = in.nextLong();
            int remainder11 = (int) (n % 11);
            int remainder4 = (int) (n % 4);
            int remainder7 = (int) (n % 7);
            if (remainder11 == 0 || remainder4 == 0 || remainder7 == 0) {
                result = "Yes";
            } else {
                if (remainder4 % 4 == 0 || remainder4 % 7 == 0 || remainder11 % 4 == 0 || remainder11 % 7 == 0 || remainder7 % 4 == 0 || remainder7 % 7 == 0 ) {
                    result = "Yes";
                } else {
                    result = "No";
                }

            }

            System.out.println(result);

        }


    }
}
