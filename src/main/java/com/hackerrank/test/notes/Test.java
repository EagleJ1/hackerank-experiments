package com.hackerrank.test.notes;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by txcakaloglu on 2/15/17.
 */
public class Test {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        for (int i = 0; i <= 1E5; i++) {
            vector.add(i, new Random((long) 1E5).toString());
        }
        System.out.println(vector.get(vector.size() - 1));
        vector.remove(0);

        Queue<String> queue = new ArrayBlockingQueue<String>(3);
        queue.remove();
    }
}
