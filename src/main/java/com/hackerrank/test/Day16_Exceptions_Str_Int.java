package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/16/17.
 */
public class Day16_Exceptions_Str_Int {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        String msg = "";
        try
        {
            int i = Integer.parseInt(S);
            msg = String.valueOf(i);

        }catch (Exception ex)
        {
            msg = "Bad String";
        }
        finally {
            System.out.println(msg);
        }


    }
}
