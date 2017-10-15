package com.hackerrank.test.challenging;

import java.util.*;

/**
 * Created by txcakaloglu on 2/20/17.
 */
public class Longest_Substring {
    public static int lengthOfLongestSubstring(String s) {
        List<Character> visited = new LinkedList<Character>();
        int localLongestSubstring = 0;
        int finalLongestSubString = 0;
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (!visited.contains(currChar)) {
                visited.add(currChar);
                localLongestSubstring++;
            } else {
                visited.subList(0, visited.indexOf(currChar)+1).clear();
                visited.add(currChar);
                localLongestSubstring = visited.size();
            }

            finalLongestSubString = Math.max(localLongestSubstring, finalLongestSubString);
        }

        return finalLongestSubString;

    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("bpfbhmipx");
        System.out.println(result);
    }
}
