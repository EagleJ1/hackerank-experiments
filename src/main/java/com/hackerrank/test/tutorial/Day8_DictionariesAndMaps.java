package com.hackerrank.test.tutorial;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by jackalhan on 1/15/17.
 */
public class Day8_DictionariesAndMaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new TreeMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }

        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.containsKey(s))
            {
                System.out.format("%s=%d\n",s,phoneBook.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
