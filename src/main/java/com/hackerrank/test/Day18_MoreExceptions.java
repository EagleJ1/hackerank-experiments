package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/16/17.
 */
class Calculator
{

    int power(int number, int power) {
        if (number < 0 || power < 0)
            throw new IllegalArgumentException("n and p should be non-negative");
        else
            return (int) Math.pow(number, power);
    }
}
public class Day18_MoreExceptions {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
