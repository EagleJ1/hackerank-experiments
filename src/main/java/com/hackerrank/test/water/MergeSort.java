package com.hackerrank.test.water;

import java.util.Arrays;

/**
 * Created by jackalhan on 2/4/17.
 */
public class MergeSort {

    public static void main(String[] args) {
        int [] arr = new int[]{1, 6 , 4 , 2 , 3, 0 , 22 , 19 , 45 , 44};
        System.out.println(Arrays.toString(arr));
        mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int[] array) {
        mergesort(array, new int[array.length], 0, array.length - 1);
    }

    private static void mergesort(int[] array, int[] tempArray, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergesort(array, tempArray, leftStart, middle); //sort the left
        mergesort(array, tempArray, middle + 1, rightEnd); // sort the right
        mergeHalves(array, tempArray, leftStart, rightEnd); // merge

    }

    private static void mergeHalves(int[] array, int[] tempArray, int leftStart, int rightEnd) {
        // like middle point and middle point + 1
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;

        // total element size we are going to copy.
        int size = rightEnd - leftStart + 1;

        int leftIndex = leftStart;
        int rightIndex = rightStart;
        int index = leftStart; // index for temp array copying.

        //copying smaller elements from boths sides to the temp array;
        while (leftIndex <= leftEnd && rightIndex <= rightEnd) {
            if (array[leftIndex] <= array[rightIndex]) {
                tempArray[index] = array[leftIndex];
                leftIndex++;
            } else {
                tempArray[index] = array[rightIndex];
                rightIndex++;
            }
            index++;
        }
        // copy the remaining left elements over
        System.arraycopy(array, leftIndex, tempArray, index, leftEnd - leftIndex + 1);
        // copy the remaining right elements over
        System.arraycopy(array, rightIndex, tempArray, index, rightEnd - rightIndex + 1);

        // temp to actual array
        System.arraycopy(tempArray, leftStart, array, leftStart, size);

    }
}
