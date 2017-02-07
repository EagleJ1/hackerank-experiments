package com.hackerrank.test.challenging;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jackalhan on 2/7/17.
 */
public class Tag_Content_Extractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            Pattern p = Pattern.compile("<(.+)>([^<>]+)</\\1>");
            Matcher m = p.matcher(line);
            boolean f = true;
            while (m.find()) {
                System.out.println(m.group(2));
                f = false;
            }
            if (f) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
