package com.hackerrank.test.patterns.elemaninTeki.singleton_design_pattern;

import java.util.LinkedList;

/**
 * Created by jackalhan on 2/9/17.
 */
public class ScrabbleTest {
    public static void main(String[] args) {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance 1 ID : " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<Character> player1Tiles = newInstance.getTiles(7);
        System.out.println("Player 1: " +  player1Tiles);
        System.out.println(newInstance.getLetterList());

        Singleton newInstance2 = Singleton.getInstance();
        System.out.println("Instance 2 ID : " + System.identityHashCode(newInstance2));
        System.out.println(newInstance.getLetterList());
        LinkedList<Character> player2Tiles = newInstance.getTiles(7);
        System.out.println("Player 2: " +  player2Tiles);
        System.out.println(newInstance2.getLetterList());
    }
}
