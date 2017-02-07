package com.hackerrank.test.challenging;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by jackalhan on 2/6/17.
 */
public class Pattern_Syntax_Checker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            String result = "";
            try {
                Pattern.compile(pattern);
                result = "Valid";

            } catch (Exception ex) {
                result = "Invalid";
            } finally {
                System.out.println(result);
            }
        }
    }

}
