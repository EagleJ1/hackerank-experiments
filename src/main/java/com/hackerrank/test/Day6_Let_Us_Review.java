package com.hackerrank.test;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by jackalhan on 1/15/17.
 */
public class Day6_Let_Us_Review {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wordNumber = scanner.nextInt();
        scanner.nextLine();
        String[] words = new String[wordNumber];
        for (int i = 0; i < wordNumber; i++) {
            words[i] = scanner.nextLine();
            System.out.println(splitByIndex(words[i].toCharArray()));
        }
        scanner.close();
    }

    public static String splitByIndex(char[] word) {

        String even = "";
        String odd = "";
        for (int i = 0; i < word.length; i++) {
            if (i % 2 == 0) {
                even = even + word[i];
            } else {
                odd = odd + word[i];
            }
        }

        return even + " " + odd;

    }


}
