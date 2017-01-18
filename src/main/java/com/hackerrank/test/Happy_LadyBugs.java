package com.hackerrank.test;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by jackalhan on 1/17/17.
 */
public class Happy_LadyBugs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfGames = in.nextInt();
        for(int a0 = 0; a0 < numOfGames; a0++){
            int boardSize = in.nextInt();
            String boardLetter = in.next();
            String msg = "";
            Map<Character, Integer> board = new HashMap<Character, Integer>();
            char[] letters = boardLetter.toCharArray();
            for (int i = 0; i < letters.length; i++)
            {
                board.put(letters[i], board.get(letters[i]) == null ? 1 : board.get(letters[i]) + 1);
            }

            if (board.size() == 1)
            {
                msg = "YES";
            }
            else {
                Iterator<Map.Entry<Character, Integer>> iterator = board.entrySet().iterator();
                boolean loop = true;
                while (iterator.hasNext() && loop) {
                    Map.Entry<Character, Integer> entry = iterator.next();

                    if (entry.getKey() != '_' & entry.getValue() == 1) {
                            loop = false;
                            msg = "NO";
                    }
                    //if (boardSize ==)


               /* if (entry.getKey() != '_' && entry.getValue() % 2 != 0)
                {
                    msg = "NO";
                }
                System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());*/
                }
            }

        }


    }
}
