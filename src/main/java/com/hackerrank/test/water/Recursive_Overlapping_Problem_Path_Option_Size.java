package com.hackerrank.test.water;

import java.time.LocalTime;
import java.util.Scanner;

/**
 * Created by jackalhan on 1/28/17.
 */
public class Recursive_Overlapping_Problem_Path_Option_Size {

    /* SAMPLE INPUT
        8
        12
        1 2
        1 6
        2 4
        3 0
        3 2
        3 5
        4 2
        5 3
        5 4
        5 6
        6 1
        6 5
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gridSize = scanner.nextInt();
        boolean[][] grid = new boolean[gridSize][gridSize];
        int bloksSize = scanner.nextInt();
        for (int i = 0; i < bloksSize; i++) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            grid[row][col] = true;
        }
        // Classical Recursive Run Time Complexity O(2^n^2)
        long begin = System.currentTimeMillis();
        System.out.println(countPaths(grid, 0, 0));
        long end = System.currentTimeMillis();
        System.out.format("%d miliseconds took for executing in Classical Recursive approach", begin - end);

        // Memoization Run Time Complexity O(n^2)
        begin = System.currentTimeMillis();
        int[][] storedPaths = new int[gridSize][gridSize];
        System.out.println(countPaths(grid, 0, 0, storedPaths));
        end = System.currentTimeMillis();
        System.out.format("%d miliseconds took for executing in Memoization approach", begin - end);

        // Dynamic Programming without using memoization O(n^2)
        begin = System.currentTimeMillis();
        //System.out.println(countPaths(grid, 0, 0, storedPaths));
        end = System.currentTimeMillis();
        System.out.format("%d miliseconds took for executing in Dynamic Programming approach", begin - end);


        scanner.close();

    }

    public static int countPaths(boolean[][] grid, int row, int col, int[][] storedPaths) {
        if (isBlockedCell(grid, row, col)) return 0;
        if (isAtEnd(grid, row, col)) return 1;
        if (storedPaths[row][col] == 0) {
            storedPaths[row][col] = countPaths(grid, row + 1, col, storedPaths) + countPaths(grid, row, col + 1, storedPaths);
        }
        return storedPaths[row][col];
    }

    public static int countPaths(boolean[][] grid, int row, int col) {
        if (isBlockedCell(grid, row, col)) return 0;
        if (isAtEnd(grid, row, col)) return 1;
        return countPaths(grid, row + 1, col) + countPaths(grid, row, col + 1);
    }

    private static boolean isAtEnd(boolean[][] grid, int row, int col) {
        if (grid.length - row == 1 || grid.length - col == 1)
            return true;
        else
            return false;


    }

    private static boolean isBlockedCell(boolean[][] grid, int row, int col) {
        return grid[row][col];
    }
}
