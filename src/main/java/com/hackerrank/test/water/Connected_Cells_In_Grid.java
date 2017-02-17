package com.hackerrank.test.water;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by txcakaloglu on 1/31/17.
 */
public class Connected_Cells_In_Grid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowSize = scanner.nextInt();
        int colSize = scanner.nextInt();
        int[][] matrix = new int[rowSize][colSize];
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        boolean[][] visited = new boolean[rowSize][colSize];
        int counter = 0;
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                if (!visited[row][col])
                    counter = Math.max(counter, findRegion(matrix, visited, row, col, rowSize, colSize));
            }
        }
        System.out.println(counter);
    }

    private static int findRegion(int[][] matrix, boolean[][] visited, int row, int col, int rowSize, int colSize) {
        if (row < 0 || row >= rowSize || col < 0 || col >= colSize) {
            return 0;
        }

        if (visited[row][col]) {
            return 0;
        }
        visited[row][col] = true;

        if (matrix[row][col] == 0) {
            return 0;
        } else {
            return 1 +
                    findRegion(matrix, visited, row - 1, col - 1, rowSize, colSize) +
                    findRegion(matrix, visited, row - 1, col, rowSize, colSize) +
                    findRegion(matrix, visited, row, col - 1, rowSize, colSize) +
                    findRegion(matrix, visited, row - 1, col + 1, rowSize, colSize) +
                    findRegion(matrix, visited, row, col, rowSize, colSize) +
                    findRegion(matrix, visited, row, col + 1, rowSize, colSize) +
                    findRegion(matrix, visited, row + 1, col - 1, rowSize, colSize) +
                    findRegion(matrix, visited, row + 1, col, rowSize, colSize) +
                    findRegion(matrix, visited, row + 1, col + 1, rowSize, colSize);
        }

    }

}
