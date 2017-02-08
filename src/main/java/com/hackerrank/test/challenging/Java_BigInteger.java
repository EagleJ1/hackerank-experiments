package com.hackerrank.test.challenging;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by jackalhan on 2/8/17.
 */
public class Java_BigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        System.out.println(n.isProbablePrime(5) ? "prime" : "not prime");
    }
}
