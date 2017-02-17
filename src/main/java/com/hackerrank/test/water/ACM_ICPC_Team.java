package com.hackerrank.test.water;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by jackalhan on 1/18/17.
 */
public class ACM_ICPC_Team {

    /*
    * You are given a list of  people who are attending ACM-ICPC World Finals. Each of them are either well versed in a topic or they are not.
    * Find out the maximum number of topics a 2-person team can know. And also find out how many teams can know that maximum number of topics.
    *
    Sample Input
    4 5
    10101
    11100
    11010
    00101

    Sample Output
    5
    2
      * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfPeople = scanner.nextInt();
        int nOfTopics = scanner.nextInt();
        int[][] topOfPeople = new int[nOfPeople][nOfTopics];
        scanner.nextLine();
        int i = 0;
        while (i <= nOfPeople - 1) {
            char[] knowledgeIndicator = scanner.nextLine().trim().toCharArray();
            for (int j = 0; j < knowledgeIndicator.length; j++) {
                topOfPeople[i][j] = Integer.parseInt(String.valueOf(knowledgeIndicator[j]));
            }
            i++;
        }
        //Map<String, Integer> array = new HashMap<String, Integer>();
        int maxKnown = 0;
        int teamNumber = 0;
        for (int o = 0; o < nOfPeople - 1; o++) {
            for (int n = o + 1; n < nOfPeople; n++) {
                int known = 0;

                for (int t = 0; t < nOfTopics; t++) {
                    if ((topOfPeople[o][t] == topOfPeople[n][t]) && topOfPeople[o][t] == 1) {
                        known++;
                    } else if (topOfPeople[o][t] != topOfPeople[n][t]) {
                        known++;
                    }
                }

                if (maxKnown == known) {
                    teamNumber++;
                } else if (maxKnown < known) {
                    maxKnown = known;
                    teamNumber = 1;
                }
            }
        }

        System.out.println(maxKnown);
        System.out.println(teamNumber);
    }


}
