package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by jackalhan on 2/14/17.
 */
public class Bit_Manipulation_Lonely_Integer {
    /*
    x ^ x = 0
    x ^ 0 = x
    XOR is commutative and associative
    */

    public static int lonelyInteger(int[] a) {
        int lonelyInteger = 0;
        for (int num : a) {
            lonelyInteger = lonelyInteger ^ num; //  lonelyInteger ^= num;
        }
        return lonelyInteger;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }

}
