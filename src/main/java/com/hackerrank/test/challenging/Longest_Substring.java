package com.hackerrank.test.challenging;

import java.util.HashMap;

/**
 * Created by txcakaloglu on 2/20/17.
 */
public class Longest_Substring {
    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> visited = new HashMap<Character, Integer>();
        int localLongestSubstring = 0;
        int finalLongestSubString = 0;
        char stopChar = 0;
        for (int i = 0; i < arr.length; i++) {
            if (visited.containsKey(arr[i])) {
                localLongestSubstring = (i + 1) - visited.get(arr[i]);
                visited.put(arr[i], i + 1);
                stopChar = arr[i];
            } else {
                visited.put(arr[i], i + 1);
                if (stopChar != 0) {
                    localLongestSubstring = arr.length - visited.get(stopChar);
                } else {
                    localLongestSubstring = i + 1;
                }

            }

            finalLongestSubString = Math.max(localLongestSubstring, finalLongestSubString);
        }


        if (s.length() > 0) {
           // stopChar = arr[arr.length - 1];
            localLongestSubstring = arr.length - visited.get(stopChar) + 1;
            finalLongestSubString = Math.max(localLongestSubstring, finalLongestSubString);
        }
        return finalLongestSubString;

    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("aabbcccc");
        System.out.println(result);
    }
}
