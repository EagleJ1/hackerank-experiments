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
            arr[arr.length - arrSize] = scanner.nextInt();
        }
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