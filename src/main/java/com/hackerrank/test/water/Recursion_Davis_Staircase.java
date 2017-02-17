package com.hackerrank.test.water;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jackalhan on 2/13/17.
 */
public class Recursion_Davis_Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        HashMap<Integer, Integer> stored = new HashMap<Integer, Integer>();
        long beginTime = System.currentTimeMillis();
        for (int a0 = 0; a0 < s; a0++) {
            int stairs = in.nextInt();
            //With Memoization Solution
            System.out.println(calculateWaysToClimbWithMemo(stairs, stored));

            //With Dynamic Programming
            //System.out.println(calculateWaysToClimbWithDP(stairs));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("TIME ELAPSED: " + (endTime - beginTime));


    }

    //With Memoization Solution
    public static int calculateWaysToClimbWithMemo(int stairs, HashMap<Integer, Integer> storedRemainingStairs) {
        if (stairs == 0) {
            return 1;
        } else if (stairs < 0) {
            return 0;
        }

        if (storedRemainingStairs.get(stairs) == null) {
            storedRemainingStairs.put(stairs, calculateWaysToClimbWithMemo(stairs - 1, storedRemainingStairs) + calculateWaysToClimbWithMemo(stairs - 2, storedRemainingStairs) + calculateWaysToClimbWithMemo(stairs - 3, storedRemainingStairs));
        }
        return storedRemainingStairs.get(stairs);

    }

    //With Dynamic Programming Solution
    public static int calculateWaysToClimbWithDP(int stairs) {
        if (stairs <= 1) {
            return 1;
        } else if (stairs < 0) {
            return 0;
        }
        int[] ways = new int[stairs + 1];
        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 2;
        for (int i = 3; i <= stairs; i++) {
            ways[i] = ways[i - 1] + ways[i - 2] + ways[i - 3];
        }
        return ways[stairs];

    }
}
