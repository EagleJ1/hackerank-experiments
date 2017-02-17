package com.hackerrank.test.water;

import java.util.*;

/**
 * Created by jackalhan on 1/18/17.
 */
public class Equalize_The_Array {
    /*
    * Karl has an array of  integers defined as . In one operation, he can delete any element from the array.
      Karl wants all the elements of the array to be equal to one another. To do this, he must delete zero or more elements from the array.
      Find and print the minimum number of deletion operations Karl must perform so that all the array's elements are equal.
    *
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        Map<Integer, Integer> array = new HashMap<Integer, Integer>();
        for (int i = 0; i < arraySize; i++)
        {
            int num = scanner.nextInt();
            array.put(num, array.get(num) == null ? 1 : array.get(num) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(array.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        int maxSameNumberCount = list.get(0).getValue();
        System.out.print(arraySize - maxSameNumberCount);
        scanner.close();

    }
}
