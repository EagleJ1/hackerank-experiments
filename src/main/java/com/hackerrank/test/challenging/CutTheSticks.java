package com.hackerrank.test.challenging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jackalhan on 1/16/17.
 */
public class CutTheSticks {
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
