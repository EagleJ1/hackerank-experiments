package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 2/14/17.
 */
public class BFS_Connected_Cell_In_A_Grid {

    public static int getBiggestRegion(int[][] matrix) {

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}
