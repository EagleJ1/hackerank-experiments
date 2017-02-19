package com.hackerrank.test.challenging;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by jackalhan on 2/18/17.
 */
public class Java_Hashset_Pair {
    // FIRST OPTION
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i< size; i++){
            set.add(scanner.next() + " " + scanner.next());
            System.out.println(set.size());
        }
        scanner.close();

    }*/

    // SECOND OPTION
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i< t; i++){
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }

    }
}
