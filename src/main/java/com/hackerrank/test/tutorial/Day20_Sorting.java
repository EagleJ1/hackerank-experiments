package com.hackerrank.test.tutorial;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 1/19/17.
 */
public class Day20_Sorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = scanner.nextInt();
        }
        bubbleSort(arr);
        scanner.close();
    }

    public static void bubbleSort(int[] arr) {


        int endPosition = arr.length - 1;
        int swapPosition;
        int swapCounter = 0;
        while (endPosition > 0) {
            swapPosition = 0;

            for (int i = 0; i < endPosition; i++) {
                if (arr[i] > arr[i + 1]) {
                    //swap elements
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapPosition = i;
                    swapCounter++;
                }
            }
            endPosition = swapPosition;
        }
        System.out.format("Array is sorted in %d swaps.\n", swapCounter);
        System.out.format("First Element: %d\n", arr[0]);
        System.out.format("Last Element: %d\n",arr[arr.length - 1]);
    }


}
