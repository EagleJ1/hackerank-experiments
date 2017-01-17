package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/15/17.
 */
public class Day10_BinaryNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        String binary = Integer.toBinaryString(n);
        int maxConsecutive = 0;
        int consecutiveCount = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                consecutiveCount++;
            } else {
                consecutiveCount = 0;
            }
            if (consecutiveCount >= maxConsecutive) {
                maxConsecutive = consecutiveCount;
            }
        }

        System.out.println(maxConsecutive);


    }

}
