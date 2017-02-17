package com.hackerrank.test.challenging;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by jackalhan on 1/17/17.
 */
public class Repeated_String {
   /*
   * Lilah has a string, , of lowercase English letters that she repeated infinitely many times.
    Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.

    Sample Input 0
    aba
    10

    Sample Output 0
    7

    The first  letters of the infinite string are abaabaabaa. Because there are  a's, we print  on a new line.

    Sample Input 1
    a
    1000000000000

    Sample Output 1
    1000000000000

    Because all of the first  letters of the infinite string are a, we print  on a new line.
   * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long sWithA = s.chars().filter(myChar -> myChar == 'a').count();
        long times = n/s.length();
        long rest = n % s.length();

        long totalSWithA = times * sWithA + s.substring(0, (int)rest).chars().filter(myChar -> myChar == 'a').count();
        System.out.println(totalSWithA);
        in.close();

    }

}
