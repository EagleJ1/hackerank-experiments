package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 2/6/17.
 */
public class Anagram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    private static boolean isAnagram(String a, String b) {

        int counters = 0;
        int[] anagramArr = new int['z' - 'a' + 1];

        for (char c : a.toLowerCase().toCharArray())
            anagramArr[c - 'a']++;

        for (char c : b.toLowerCase().toCharArray())
            anagramArr[c - 'a']--;

        for (int counter : anagramArr) {
            counters += (counter < 0) ? -counter : counter;
        }

        return counters == 0 ? true : false;

    }


}
