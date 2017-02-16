package com.hackerrank.test.notes;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by txcakaloglu on 2/15/17.
 */
public class Test {

    public static void main(String[] args) {

        String[] drivers = {"Tol", "Zey"};
        Vector<String> vector = new Vector<String>(Arrays.asList(drivers));

        for (String item : vector){
            System.out.println(item);
        }


        /*
        Queue<String> queue = new ArrayBlockingQueue<String>(3);
        queue.remove();*/


    }
}
