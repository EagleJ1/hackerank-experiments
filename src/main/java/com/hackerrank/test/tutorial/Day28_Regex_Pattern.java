package com.hackerrank.test.tutorial;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jackalhan on 1/26/17.
 */
public class Day28_Regex_Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> people = new ArrayList<String>();
        Pattern pattern = Pattern.compile(".*@gmail.com.*"); //Pattern.compile("@[\\w.]+");
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next().toLowerCase();
            Matcher matcher = pattern.matcher(emailID);
            if (matcher.matches())
            {
                people.add(firstName);
            }
        }
        in.close();
        Collections.sort(people);
        for(String firstName : people)
            System.out.println(firstName);
    }
}
