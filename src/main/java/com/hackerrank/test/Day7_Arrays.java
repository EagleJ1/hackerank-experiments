package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/15/17.
 */
public class Day7_Arrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }

        String temp = "";
        for (int i = n -1; i>= 0; i-- )
        {
            temp = temp + arr[i] + " ";
        }
        System.out.println(temp);
        in.close();

    }
}
