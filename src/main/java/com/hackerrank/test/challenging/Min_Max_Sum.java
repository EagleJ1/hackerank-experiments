package com.hackerrank.test.challenging;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by txcakaloglu on 2/16/17.
 */
public class Min_Max_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;
        long min = 1000000000;
        long max = -1000000000;
        int size = in.nextInt();
        for(int i=0; i < size; i++){
            long num = in.nextLong();
            sum = sum + num;
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        in.close();
        long finalMin = sum - max;
        long finalMax = sum - min;

        System.out.println(finalMin + " " + finalMax);
    }
}
