package com.hackerrank.test.water;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by jackalhan on 1/28/17.
 */
public class Dynamic_Programming_Coin_Change {
    /*
    * How many different ways can you make change for an amount, given a list of coins? In this problem, your code will need to efficiently compute the answer.
    *
    * Sample Input
      10 4
      2 5 3 6

      Sample Output
      5

    * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for (int coins_i = 0; coins_i < m; coins_i++) {
            coins[coins_i] = in.nextInt();
        }

        System.out.println(countWays(coins, amount));

    }

    private static long countWays(int[] coins, int amount) {
        int colsSize = amount + 1;
        int rowsSize = coins.length;
        if (coins.length < 1) return 0;

        long[][] coinsAmountMatrix = new long[rowsSize][colsSize];
        for (int i = 0; i < rowsSize; i++) {
            for (int j = 0; j < colsSize; j++) {
                if (j == 0) {
                    coinsAmountMatrix[i][j] = 1;
                } else {
                    if (i == 0) {
                        if (j % coins[i] == 0)
                            coinsAmountMatrix[i][j] = 1;
                        else
                            coinsAmountMatrix[i][j] = 0;

                    } else {
                        if (coins[i] > j) {
                            coinsAmountMatrix[i][j] = coinsAmountMatrix[i - 1][j];
                        } else {
                            coinsAmountMatrix[i][j] = coinsAmountMatrix[i - 1][j] + coinsAmountMatrix[i][j - coins[i]];
                        }
                    }
                }

            }
        }

        return coinsAmountMatrix[rowsSize - 1][colsSize-1];


    }


    /*
    static long countWays(int coins[], int dollars) {
        //Time complexity of this function: O(mn)
        //Space Complexity of this function: O(n)

        // table[i] will be storing the number of solutions
        // for value i. We need n+1 rows as the table is
        // constructed in bottom up manner using the base
        // case (n = 0)
        long[] table = new long[dollars + 1];

        // Initialize all table values as 0
        //Arrays.fill(table, 0);   //O(n)

        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i = 0; i < coins.length; i++)
            for (int j = coins[i]; j <= dollars; j++)
                table[j] += table[j - coins[i]];

        return table[dollars];
    }*/
}
