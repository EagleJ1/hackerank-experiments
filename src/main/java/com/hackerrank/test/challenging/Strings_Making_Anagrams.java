package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 1/26/17.
 */
public class Strings_Making_Anagrams {

    public static int numberNeeded(String first, String second) {

        int counter = 0;
        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < second.length(); j++) {

                if (first.charAt(i) == second.charAt(j)) {
                    counter = counter - j + 1;
                    break;
                } else {
                    counter++;
                }
                if (j > second.length() - 1)
                    j = 0;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
