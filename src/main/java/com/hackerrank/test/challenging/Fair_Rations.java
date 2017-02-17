package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/17/17.
 */
public class Fair_Rations {
    /*
    * You are the benevolent ruler of Rankhacker Castle, and today you're distributing bread to a straight line of subjects. Each  subject (where ) already has  loaves of bread.
      Times are hard and your castle's food stocks are dwindling, so you must distribute as few loaves as possible according to the following rules:
      Every time you give a loaf of bread to some person , you must also give a loaf of bread to the person immediately in front of or behind them in the line (i.e., persons  or ).
      After all the bread is distributed, each person must have an even number of loaves.
      Given the number of loaves already held by each citizen, find and print the minimum number of loaves you must distribute to satisfy the two rules above. If this is not possible, print NO.

    Sample Input 0
    5
    2 3 4 5 6

    Sample Output 0
    4

    * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for (int B_i = 0; B_i < N; B_i++) {
            B[B_i] = in.nextInt();
        }
        String msg = "";
        if (N < 2) {
            msg = "NO";
        } else if (N == 2) {
            if (countOdds(B) == 2)
                msg = "2";
            else
                msg = "NO";
        } else {

            int oddIndex = 0;
            int sum = 0;
            boolean loop = true;
            while ((oddIndex > -1) && (loop == true) ) {
                if (oddIndex == B.length - 1) {
                    msg = "NO";
                    loop = false;
                } else {
                    oddIndex = getOddIndex(B);
                    if ((oddIndex != -1) && (oddIndex != B.length - 1) ) {
                        addByOne(B, oddIndex);
                        sum = sum + 2;
                    }
                    else
                    {
                        msg = String.valueOf(sum);
                    }
                }
            }

        }

        System.out.print(msg);
        in.close();

    }

    public static int countOdds(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 != 0) {
                sum++;
            }
        }
        return sum;
    }

    public static int getOddIndex(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }

    public static void addByOne(int[] list, int oddIndex) {

        try {
            list[oddIndex] = list[oddIndex] + 1;
            list[oddIndex + 1] = list[oddIndex + 1] + 1;
        }catch (Exception ex)
        {
            System.out.print(ex.getStackTrace());
        }

    }
}
