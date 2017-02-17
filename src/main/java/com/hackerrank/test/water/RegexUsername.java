package com.hackerrank.test.water;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jackalhan on 2/7/17.
 */
public class RegexUsername {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0) {
            String username = in.nextLine();
            String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$"; // 1st char must be alphabetic so the remain ones should be between 7 and 29


            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}

