package com.hackerrank.test.water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jackalhan on 1/16/17.
 */
public class Cut_The_Sticks {

    /*
    You are given  sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

    Suppose we have six sticks of the following lengths:

    5 4 4 2 2 8
    Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following:

    3 2 2 6
    The above step is repeated until no sticks are left.

    Given the length of  sticks, print the number of sticks that are left before each subsequent cut operations.

    Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).

    Sample Input 0
    6
    5 4 4 2 2 8

    Sample Output 0
    6
    4
    2
    1

    sticks-length        length-of-cut   sticks-cut
    5 4 4 2 2 8             2               6
    3 2 2 _ _ 6             2               4
    1 _ _ _ _ 4             1               2
    _ _ _ _ _ 3             3               1
    _ _ _ _ _ _           DONE            DONE
    * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int listSize = sc.nextInt();
        //sc.nextLine();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < listSize; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        while (list.size()!= 0) {
            int size = list.size();
            list = cutList(list, findSmallest(list));
            list.removeAll(Collections.singleton(0));
            System.out.println(size);
        }


    }

    static int findSmallest(List<Integer> list) {
        Collections.sort(list);
        return list.get(0);
    }

    static List<Integer> cutList(List<Integer> list, int cutSize) {
        List<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)- cutSize <= 0)
                newList.add(0);
            else
                newList.add(list.get(i) - cutSize);
        }
        return newList;
    }


}
