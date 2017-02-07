package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by jackalhan on 2/7/17.
 */
public class Subarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        while (arrSize-- > 0) {
            arr[arr.length - arrSize] = scanner.nextInt();
        }
        scanner.close();
    }
}
