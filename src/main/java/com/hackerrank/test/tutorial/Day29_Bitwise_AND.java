package com.hackerrank.test.tutorial;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 1/31/17.
 */
public class Day29_Bitwise_AND {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int setSize = sc.nextInt();
            int K = sc.nextInt();

            System.out.println(solve(setSize, K));
        }

        sc.close();
    }

    static int solve(int setSize, int K) {
        int result = 0;
        for (int i = 1; i <= setSize; i++) {
            for (int sub_i = i + 1; sub_i <= setSize; sub_i++) {
                int current = i & sub_i;
                if (current > result && current < K) {
                    result = current;
                }
            }
        }
        return result;
    }
}
