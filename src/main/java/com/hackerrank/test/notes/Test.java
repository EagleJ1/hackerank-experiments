package com.hackerrank.test.notes;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by txcakaloglu on 2/15/17.
 */
public class Test {

    public static void main(String[] args) {

        String[] arr = {"5", "-2", "4", "Z", "X", "9", "+", "+"};
        int n = 8;
        int score = 0;
        Stack<Integer> numbers = new Stack<Integer>();
        //Stack<Integer> addNumbers = new Stack<Integer>();
        Stack<Integer> totalScore = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            if (isNumeric(arr[i])) {
                score = score + Integer.parseInt(arr[i]);
                numbers.push(Integer.valueOf(arr[i]));
                totalScore.push(score);
            } else if (arr[i].toLowerCase().equals("x")) {
                if (!totalScore.isEmpty()) {
                    int specialCase = numbers.pop()* 2;
                    //score = score +(specialCase);
                    //numbers.push(specialCase);
                    //totalScore.push(score);
                    score = score + (specialCase);
                    numbers.push(specialCase);
                    totalScore.push(score);
                }
            } else if (arr[i].toLowerCase().equals("+")) {
                int subScore = 0;
                if (!numbers.isEmpty()) {
                    subScore = numbers.pop();
                    int temp = subScore;
                    if (!numbers.isEmpty()) {
                        subScore = subScore + numbers.pop();
                    }
                    numbers.push(temp);
                    score = score + subScore;
                    numbers.push(subScore);
                    totalScore.push(score);

                }
            } else if (arr[i].toLowerCase().equals("z")) {
                if (!numbers.isEmpty()) {
                    score = score - numbers.pop();
                    totalScore.pop();
                }
            }
        }
        System.out.println(score);

    }

    public static boolean isNumeric(String s) {
        return s.matches("[-+]?\\d*\\.?\\d+");
    }
}
