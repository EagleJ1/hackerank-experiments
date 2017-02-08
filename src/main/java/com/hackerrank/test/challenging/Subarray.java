package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by jackalhan on 2/7/17.
 */
public class Subarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        while (arrSize-- > 0) {
            arr[arr.length - 1- arrSize] = scanner.nextInt();
        }

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int subTotal = 0;
            for (int j = i; j < arr.length; j++) {
                subTotal = subTotal + arr[j];
                if (subTotal < 0) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
        scanner.close();
    }
}


/*
* public int findMaxProfit(int[] prices)
{
    int maxProfit = 0;
    for(int i = 0; i< prices.length; i++)   // [7,1,5,3,6,4]
    {
        for(int j = i + 1; j < prices.length; j++){ //[1,5,3,6,4]
        int profit = prices[j] - prices[i]; // 1 -7 = -6
        maxProfit = Math.max(profit, maxProfit); //0 compare -6
        }
    }
    return maxProfit;
}

 */
