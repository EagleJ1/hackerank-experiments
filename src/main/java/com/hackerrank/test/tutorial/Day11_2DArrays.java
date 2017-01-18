package com.hackerrank.test.tutorial;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/16/17.
 */
public class Day11_2DArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        int maxSum = -999999;
        int lifeSpan = arr.length - 2;
        for (int x = 0; x < lifeSpan; x++) {
            for (int y = 0; y < lifeSpan; y++) {

                int tempSum = arr[x][y] +
                        arr[x][y + 1] +
                        arr[x][y + 2] +
                        arr[x + 1][y + 1] +
                        arr[x + 2][y] +
                        arr[x + 2][y + 1] +
                        arr[x + 2][y + 2];

               maxSum = Math.max(tempSum, maxSum);
            }
        }

        System.out.print(maxSum);
    }

}
