package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by jackalhan on 2/13/17.
 */
public class Java_2D_Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int largestNumber = -999999999;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int localLargestNumber = 0;
                    try {
                        localLargestNumber = arr[i][j] + arr[i - 1][j] + arr[i - 1][j - 1]
                                + arr[i - 1][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j - 1] + arr[i + 1][j];

                    } catch (Exception ex) {
                        localLargestNumber = -999999999;
                    } finally {
                        largestNumber = Math.max(largestNumber, localLargestNumber);
                    }
            }
        }

        System.out.println(largestNumber);

    }
}
