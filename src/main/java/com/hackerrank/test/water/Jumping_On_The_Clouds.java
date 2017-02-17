package com.hackerrank.test.water;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/17/17.
 */
public class Jumping_On_The_Clouds {

    /*
    Emma is playing a new mobile game involving  clouds numbered from  to . A player initially starts out on cloud , and they must jump to cloud . In each step,
    she can jump from any cloud  to cloud  or cloud. There are two types of clouds, ordinary clouds and thunderclouds. The game ends if Emma jumps onto a thundercloud,
    but if she reaches the last cloud (i.e., ), she wins the game! jump(1).png Can you find the minimum number of jumps Emma must make to win the game?
    It is guaranteed that clouds and  are ordinary-clouds and it is always possible to win the game.
    * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }

        int numberOfSteps = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            if (i > 1) {
                if (c[i - 2] == 0) {
                    i = i - 1;
                }
                numberOfSteps++;
            } else if (i == 1) {
                numberOfSteps++;
            }
        }

        System.out.println(numberOfSteps);

    }

}
