package com.hackerrank.test.water;

import java.util.Scanner;

/**
 * Created by jackalhan on 2/14/17.
 */
public class Bit_Manipulation_Lonely_Integer {
    /*
    x ^ x = 0
    x ^ 0 = x
    XOR is commutative and associative

    // The logic is that, by using XOR binary number of each integer that have even duplication will be nuatralize itself,
    therefore the only one remains will be the number of lonely integer.
    Therefore, for example ;

    101 = 5
    011 = 3
    101 = 5
    001 = 1
    001 = 1
    110 = 6
    110 = 6
    XOR (^)
    --------------
    011 (The single number remains all the set above) = 3

    Time complexity is O(n) but space complexity is O(1) constant
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
