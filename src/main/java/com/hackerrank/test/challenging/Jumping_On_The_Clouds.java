package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/17/17.
 */
public class Jumping_On_The_Clouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }

        int numberOfSteps = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            if (i > 1) {
                if (c[i - 2] == 0) {
                    i = i - 1;
                }
                numberOfSteps++;
            } else if (i == 1) {
                numberOfSteps++;
            }
        }

        System.out.println(numberOfSteps);

    }

}
