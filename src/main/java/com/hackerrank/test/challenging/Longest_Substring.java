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
            int index = i + 1;
            char currChar = arr[i];
            int stopCharIndexInMap = 0;
            if (visited.containsKey(currChar)) {
                stopCharIndexInMap = visited.get(stopChar);
                localLongestSubstring = index - stopCharIndexInMap + 1 ;
                visited.put(currChar, index);
                stopChar = currChar;
            } else {
                visited.put(currChar, index);
                stopChar = currChar;
                if (stopChar != 0) {
                    localLongestSubstring = index - visited.get(stopChar) + 1;
                } else {
                    localLongestSubstring = 1;
                }

            }

            finalLongestSubString = Math.max(localLongestSubstring, finalLongestSubString);
        }

        return finalLongestSubString;

    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("abcabcbb");
        System.out.println(result);
    }
}
