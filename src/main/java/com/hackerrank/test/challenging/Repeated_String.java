package com.hackerrank.test.challenging;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by jackalhan on 1/17/17.
 */
public class Repeated_String {

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
