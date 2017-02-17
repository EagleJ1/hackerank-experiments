package com.hackerrank.test.water;

/**
 * Created by jackalhan on 2/4/17.
 */
public class QuickSort {

    public static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }

        int pivot = array[(leftIndex + rightIndex) / 2];

        int index = partition(array, rightIndex, leftIndex, pivot); // array partition around pivot and return dividing point.

        quicksort(array, leftIndex, index - 1);
        quicksort(array, index, rightIndex);

    }

    private static int partition(int[] array, int rightIndex, int leftIndex, int pivot) {
        //move pointers towards in each other.
        while (leftIndex <= rightIndex) {
            // I want to move elements until i find an element out of order
            // Look for the element that is bigger than the pivot, should be in right side.
            // same things also for the right side.
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }

            while (array[rightIndex] > pivot) {
                rightIndex++;
            }

            if (leftIndex <= rightIndex) {
                swap(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex; //divisioin point.

    }

    private static void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;

    }
}
