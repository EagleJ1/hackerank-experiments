package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/19/17.
 */
public class Taum_And_BDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long b = in.nextLong();
            long w = in.nextLong();
            long bCost = in.nextLong();
            long wCost = in.nextLong();
            long convertCost = in.nextLong();

            long bOptimizer = wCost + convertCost;
            long wOptimizer = bCost + convertCost;
            if (bOptimizer > bCost) {
                bOptimizer = bCost;
            }
            if (wOptimizer > wCost) {
                wOptimizer = wCost;
            }

            System.out.println(b * bOptimizer + w * wOptimizer);
        }

        in.close();
    }

}
