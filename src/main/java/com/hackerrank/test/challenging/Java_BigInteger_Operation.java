package com.hackerrank.test.challenging;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by jackalhan on 2/18/17.
 */
public class Java_BigInteger_Operation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger n1 = new BigInteger(String.valueOf(scanner.nextBigInteger()));
        BigInteger n2 = new BigInteger(String.valueOf(scanner.nextBigInteger()));
        scanner.close();
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
    }

}


