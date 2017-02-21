package com.hackerrank.test.challenging;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jackalhan on 2/20/17.
 */
public class Two_Sum {

    /*
    *
    * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

      You may assume that each input would have exactly one solution, and you may not use the same element twice.

    */
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) // 9 - 6 = 3
            {
                indices[0] = map.get(target - nums[i]);
                indices[1] = i;
                return indices;
            }
            map.put(nums[i], i); // 2, 0
            // 3, 1
            // 11, 2

        }

        return indices;
    }

    public static void main(String[] args) {

        int[] result = twoSum(new int[]{2, 3, 11, 6}, 9);
    }
}
