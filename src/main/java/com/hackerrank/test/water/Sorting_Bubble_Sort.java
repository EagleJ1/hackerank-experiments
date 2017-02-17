package com.hackerrank.test.water;

import java.util.Scanner;

/**
 * Created by jackalhan on 2/12/17.
 */
public class Sorting_Bubble_Sort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int totalNumOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    numberOfSwaps++;
                }
            }
            totalNumOfSwaps += numberOfSwaps;
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.format("Array is sorted in %d swaps.\n", totalNumOfSwaps);
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }
}
