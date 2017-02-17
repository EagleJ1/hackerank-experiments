package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by jackalhan on 2/17/17.
 */
public class Braking_The_Records {
    /*
    Maria plays  games of college basketball in a season. Because she wants to go pro, she tracks her points scored per game sequentially in an array defined as . After each game , she checks to see if score  breaks her record for most or least points scored so far during that season.

    Given Maria's array of  for a season of  games, find and print the number of times she breaks her record for most and least points scored during the season.

    Note: Assume her records for most and least points at the start of the season are the number of points scored during the first game of the season.

    Sample Input 0
    9
    10 5 20 20 4 5 2 25 1

    Sample Output 0
    2 4

    * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for (int score_i = 0; score_i < n; score_i++) {
            score[score_i] = in.nextInt();
        }

        int sum = 0;
        int lowestScore = 0;
        int lowestRecordCounter = 0;
        int highestScore = 0;
        int highestRecordCounter = 0;
        for (int i = 0; i < score.length; i++) {
            if (i == 0) {
                lowestScore = score[i];
                highestScore = lowestScore;
            }
            else {
                if (lowestScore > score[i]) {
                    lowestScore = score[i];
                    lowestRecordCounter++;
                }
                if (highestScore < score[i])
                {
                    highestScore = score[i];
                    highestRecordCounter++;
                }
            }
        }
        System.out.println(highestRecordCounter + " " + lowestRecordCounter);
        // your code goes here
    }

}
