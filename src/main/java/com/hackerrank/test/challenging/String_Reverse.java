package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 2/6/17.
 */
public class String_Reverse {

    //  palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reverse = new StringBuffer(A).reverse().toString();
        String result = "";
        if (reverse.equals(A))
            result = "Yes";
        else
            result = "No";

        System.out.println(result);

    }
}
