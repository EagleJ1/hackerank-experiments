package com.hackerrank.test.challenging;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by jackalhan on 1/27/17.
 */
public class Heaps_Find_Running_Median {

    static double[] getMedians(int[] array) {
        //lowers set (lower half of the input array)
        //we need to get max int from lowers set.
        PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(new Comparator<Integer>() {
            //put the biggest value on top.
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });

        //highers set (higher half of the input array)
        //we need to get min int from highers set.
        //Default sort is min to max.
        PriorityQueue<Integer> highers = new PriorityQueue<Integer>();

        double[] medians = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            addNumber(number, lowers, highers);
            rebalance(lowers, highers);
            medians[i] = getMedian(lowers, highers);
        }
        return medians;

    }

    private static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;

        if (biggerHeap.size() == smallerHeap.size()) {
            return ((double) biggerHeap.peek() + smallerHeap.peek()) / 2;   // -> Prevent Java bug to keep it as a double, emphasizing double casting.
        } else {
            // if heaps are different sizes, return the biggerHeap top element as a median.
            return biggerHeap.peek();
        }


    }

    // we hope that they are splitted in equal sizes but this is not the case al the time
    // we may check the sizes
    // balance heaps from the bigger size heap to the smaller size.
    // looks like labelling or taggin heaps
    private static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;

        if (biggerHeap.size() - smallerHeap.size() >= 2) {
            // remove element from the bigger heap and add it to the smallerHeap for balancing them.
            smallerHeap.add(biggerHeap.poll());
        }

    }

    private static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if (lowers.size() == 0 || number < lowers.peek()) {
            lowers.add(number);
        } else {
            highers.add(number);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        for(double d : getMedians(a))
            System.out.println(d);


    }

}
