package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/16/17.
 */
public class Day14_Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

    static class Difference {
        private int[] elements;
        public int maximumDifference;

        public Difference(int[] element) {
            this.elements = element;
        }

        public void computeDifference() {

            int maxDif = 0;
            for (int i = 0; i < this.elements.length; i++) {
                for (int j = 0; j < this.elements.length; j++) {
                    int tempDif = Math.abs(this.elements[i] - this.elements[j]);
                    if (tempDif >= maxDif)
                        maxDif = tempDif;
                }
            }
            maximumDifference = maxDif;
        }

    }
}
