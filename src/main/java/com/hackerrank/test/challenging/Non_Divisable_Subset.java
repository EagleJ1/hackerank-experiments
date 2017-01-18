package com.hackerrank.test.challenging;

import java.util.*;

/**
 * Created by jackalhan on 1/16/17.
 */
public class Non_Divisable_Subset {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        final int n = in.nextInt();
        final int k = in.nextInt();

        // Idea is to divide all numbers of set by k and put these to a Map with:
        // 		-	key as remainder of input number and k
        //		-	value as count of input numbers having remainder same as key
        // If we have numbers with remainders as 0 then we will consider only one of those as
        // subset with one number complies with subset criteria.
        final Map<Integer, Integer> remainders = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int remainder = in.nextInt() % k;
            remainders.compute(remainder, (key, value) -> (value == null || key == 0) ? 1 : (value + 1));
        }

        // Iterate through all the unique pair of combinations for k and take maximum of numbers count
        // having remainder same as numbers in combination pair.
        // E.g. 5 has unique combinations - (1,4),(2,3). We will take maximum count out of 1 and 4 and
        // similarly out of 2 and 3. We will consider one number out of 0 remainders if any.
        int noOfElementsInSubset = remainders.getOrDefault(0, 0);
        int i = 1;
        for(; 2 * i < k; i++) {
            noOfElementsInSubset += Math.max(remainders.getOrDefault(i, 0), remainders.getOrDefault(k - i, 0));
        }

        // For even numbers, we will have combination having same numbers. E.g. 6 will have a combination - (3,3).
        // For this, we will just consider only one number.
        if(2 * i == k) {
            noOfElementsInSubset++;
        }

        System.out.println(noOfElementsInSubset);

        in.close();
    }

}
