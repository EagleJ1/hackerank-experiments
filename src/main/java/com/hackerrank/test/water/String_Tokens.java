package com.hackerrank.test.water;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by txcakaloglu on 2/6/17.
 */
public class String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        StringTokenizer tok = new StringTokenizer(s, "!,?._'@ ");
        System.out.println( tok.countTokens() );
        while(tok.hasMoreTokens()){
            System.out.println(tok.nextToken());
        }
        scan.close();
    }

}
