package com.hackerrank.test.challenging;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by jackalhan on 2/18/17.
 */
public class Seperate_The_Numbers {
    /*
    * Sample Input 0

        7
        1234
        91011
        99100
        101103
        010203
        13
        1

        Sample Output 0

        YES 1
        YES 9
        YES 99
        NO
        NO
        NO
        NO
*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            Queue<Long> myQ = new LinkedList<>();
            if (parseForBeautifulNumber(s, 0, 1, false, myQ)) {
                System.out.println("YES " + myQ.poll());
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean parseForBeautifulNumber(String number, int beginIndex, int parseSize, boolean finalStatus, Queue<Long> queue) {
        if (finalStatus && beginIndex + parseSize > number.length() - 1) {
            return true;
        }
        if (!finalStatus && beginIndex + parseSize >= number.length() - 1) {
            return false;
        }

        long initNumber = Long.parseLong(number.substring(beginIndex, beginIndex + parseSize));
        int newBeginIndex = beginIndex + parseSize;
        long adjNumber = Long.parseLong(number.substring(newBeginIndex, newBeginIndex + parseSize));

        if (initNumber + 1 == adjNumber) {
            queue.offer(initNumber);
            return parseForBeautifulNumber(number, newBeginIndex, parseSize, true, queue);

        } else {
            try {
                adjNumber = Long.parseLong(number.substring(newBeginIndex, newBeginIndex + parseSize + 1));
                if (initNumber + 1 == adjNumber) {
                    queue.offer(initNumber);
                    return parseForBeautifulNumber(number, newBeginIndex, parseSize + 1, true, queue);
                } else {
                    queue.poll();
                    return parseForBeautifulNumber(number, 0, parseSize + 1, false, queue);
                }
            } catch (Exception ex) {
                queue.poll();
                return false;

            }
        }


    }


}
