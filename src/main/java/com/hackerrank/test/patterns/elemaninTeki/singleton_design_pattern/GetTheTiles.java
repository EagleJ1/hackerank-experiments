package com.hackerrank.test.patterns.elemaninTeki.singleton_design_pattern;

import java.util.LinkedList;

/**
 * Created by jackalhan on 2/9/17.
 */
public class GetTheTiles implements Runnable {
    @Override
    public void run() {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance ID : " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<Character> player1Tiles = newInstance.getTiles(7);
        System.out.println("Player : " + player1Tiles);
        System.out.println("Got Tiles");
    }
}
