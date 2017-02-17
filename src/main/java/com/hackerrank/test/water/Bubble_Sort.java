package com.hackerrank.test.water;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 1/19/17.
 */
public class Bubble_Sort {

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
        printArray("Initial", arr);

        int endPosition = arr.length - 1;
        int swapPosition;

        while (endPosition > 0) {
            swapPosition = 0;

            for (int i = 0; i < endPosition; i++) {
                if (arr[i] > arr[i + 1]) {
                    //swap elements
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapPosition = i;
                }
                printArray("Current", arr);
            }
            endPosition = swapPosition;
        }

        printArray("Sorted", arr);

    }

    public static void printArray(String s, int[] arr) {
        System.out.print(s + " Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
