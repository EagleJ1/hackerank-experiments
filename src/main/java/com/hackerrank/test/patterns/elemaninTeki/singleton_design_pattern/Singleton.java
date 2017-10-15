package com.hackerrank.test.patterns.elemaninTeki.singleton_design_pattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by jackalhan on 2/9/17.
 */
public class Singleton {
    //access point.
    private static Singleton firstInstance = null;


    Character[] scrabbleLetters = {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a',
            'b', 'b', 'c', 'c', 'd', 'd', 'd', 'd', 'e', 'e', 'e', 'e', 'e',
            'e', 'e', 'e', 'e', 'e', 'e', 'e', 'f', 'f', 'g', 'g', 'g', 'h',
            'h', 'i', 'i', 'i', 'i', 'i', 'i', 'i', 'i', 'i', 'j', 'k', 'l',
            'l', 'l', 'l', 'm', 'm', 'n', 'n', 'n', 'n', 'n', 'n', 'o', 'o',
            'o', 'o', 'o', 'o', 'o', 'o', 'p', 'p', 'q', 'r', 'r', 'r', 'r',
            'r', 'r', 's', 's', 's', 's', 't', 't', 't', 't', 't', 't', 'u',
            'u', 'u', 'u', 'v', 'v', 'w', 'w', 'x', 'y', 'y', 'z',};

    private LinkedList<Character> letterList = new LinkedList<Character>(Arrays.asList(scrabbleLetters));
    static boolean firstThread = true;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (firstInstance == null) {
            if (firstThread) {
                firstThread = false;
                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized(Singleton.class) {
                if (firstInstance == null) {
                    //lazy instantion
                    firstInstance = new Singleton();
                    //shuffle for fun
                    Collections.shuffle(firstInstance.letterList);
                }
            }
        }
        return firstInstance;
    }


    public LinkedList<Character> getLetterList() {
        return firstInstance.letterList;
    }

    // Tiles to be returned to the user
    public LinkedList<Character> getTiles(int howManyTiles) {
        LinkedList<Character> tilesToSend = new LinkedList<Character>();
        // Cycle through the LinkedList while adding the starting
        // Strings to the to be returned LinkedList while deleting
        // them from letterList

        for (int i = 0; i <= howManyTiles; i++) {
            tilesToSend.add(firstInstance.letterList.remove(0));
        }
        return tilesToSend;
    }

}
