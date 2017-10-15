package com.hackerrank.test.patterns.elemaninTeki.singleton_design_pattern;

/**
 * Created by jackalhan on 2/9/17.
 */
public class ScrabbleTestThreads {
    public static void main(String[] args) {
        Runnable getTiles = new GetTheTiles();
        Runnable getTilesAgain = new GetTheTiles();
        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();
    }
}
