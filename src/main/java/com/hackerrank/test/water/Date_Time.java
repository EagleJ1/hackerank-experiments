package com.hackerrank.test.water;

import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created by jackalhan on 2/5/17.
 */
public class Date_Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        Calendar calendar= Calendar.getInstance();
        calendar.set(year,month-1,day);

        System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase());
    }
}
