package com.hackerrank.test.water;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jackalhan on 2/13/17.
 */
public class Binary_Search_Ice_Cream_Parlor {

    /*
    * Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool together  dollars for ice cream. On any given day, the parlor offers a line of  flavors.
    * Each flavor, , is numbered sequentially with a unique ID number from  to  and has a cost, , associated with it. Given the value of  and the cost of each flavor for
    * trips to the Ice Cream Parlor, help Sunny and Johnny choose two distinct flavors such that they spend their entire pool of money () during each visit. For each trip to the parlor,
    * print the ID numbers for the two types of ice cream that Sunny and Johnny purchase as two space-separated integers on a new line. You must print the smaller ID first and the larger ID second.
     Note: Two ice creams having unique IDs  and  may have the same cost (i.e., ).

     Input Format
     The first line contains an integer, , denoting the number of trips to the ice cream parlor. The  subsequent lines describe all of Sunny and Johnny's trips to the parlor; each trip is described as follows:
     The first line contains .
     The second line contains .
     The third line contains  space-separated integers denoting the cost of each respective flavor. The  integer corresponds to the cost, , for the ice cream with ID number  (where ).

     Sample Input
     2
     4
     5
     1 4 5 3 2
     4
     4
     2 2 4 3

     Sample Output
     1 4
     1 2

    *
    * */

    static class IceCream implements Comparable {
        int flavor;
        int index;

        public IceCream(int flavor, int index) {
            this.flavor = flavor;
            this.index = index;
        }

        @Override
        public int compareTo(Object o) {
            IceCream icecream = (IceCream)o;
            return this.flavor - icecream.flavor;
        }

        @Override
        public boolean equals(Object o) {
            IceCream icecream = (IceCream) o;
            return this.flavor == icecream.flavor;
        }

    }

    public static int binarySearch(int first, int last, IceCream[] arr, int search) {
        if (first > last) {
            return -1;
        }

        int mid = (first + last) / 2;

        if (arr[mid].flavor == search) {
            return arr[mid].index;
        } else {
            if (search > arr[mid].flavor) {
                return binarySearch(mid + 1, last, arr, search);
            } else {
                return binarySearch(first, mid - 1, arr, search);
            }
        }

    }

    public static void main(String[] args) {

        int t;
        int n, m;

        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for (int test = 0; test < t; test++) {

            m = in.nextInt();
            n = in.nextInt();
            IceCream[] arr = new IceCream[n];

            for (int i = 0; i < n; i++)
                arr[i] = new IceCream(in.nextInt(), i + 1);

            Arrays.sort(arr);
            int firstIndex = 100000, secondIndex = 100000;
            for (int i = 0; i < n - 1; i++) {
                int search = m - arr[i].flavor;
                if (search >= arr[i].flavor) {
                    int index = binarySearch(i + 1, n - 1, arr, search);
                    if (index != -1) {
                        System.out.println(Math.min(arr[i].index, index) + " " + Math.max(arr[i].index, index));
                        break;

                    }
                }
            }

        }

    }
}
