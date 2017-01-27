package com.hackerrank.test.challenging;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by txcakaloglu on 1/26/17.
 */
public class Strings_Making_Anagrams {

    public static int numberNeeded(String first, String second) {

        int counters = 0;
        int[] letters = new int['z' - 'a' + 1];
        for (char ch : first.toCharArray())
            letters[ch - 'a']++;
        for (char ch : second.toCharArray())
            letters[ch - 'a']--;
        for (int counter : letters) {
            counters += (counter < 0) ? -counter : counter;
        }
        return counters;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
