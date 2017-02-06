package com.hackerrank.test.tutorial;

/**
 * Created by jackalhan on 2/4/17.
 */
public class _Binary_Search_HackerRank {
    public static boolean binarySearchRecursive(int[] array, int value, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return false;
        }

        int mid = (leftIndex + rightIndex) / 2; //oveflow issue ?

        if (array[mid] == value) {
            return true;
        } else {
            if (value <= array[mid]) {
                return binarySearchRecursive(array, value, leftIndex, mid - 1); // search in left side
            } else {
                return binarySearchRecursive(array, value, mid + 1, rightIndex); // search in right side
            }
        }
    }

    public static boolean binarySearchRecursive(int[] array, int value) {
        return binarySearchRecursive(array, value, 0, array.length - 1);
    }

    public static boolean binarySearchIterative(int[] array, int value) {
        int leftIndex = 0; //leftmost position
        int rightIndex = array.length - 1; //rightmost position

        // loop as long as left and right in correct position
        while (leftIndex <= rightIndex) {
            int mid = (leftIndex + rightIndex) / 2; //oveflow issue ?

            if (array[mid] == value) {
                return true;
            } else {
                if (value <= array[mid]) {
                    rightIndex = mid - 1; // search in left side
                } else {
                    leftIndex = mid + 1; // search in right side
                }
            }
        }
        return false;
    }
}
