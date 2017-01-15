package com.hackerrank.test;

import java.util.*;

/**
 * Created by jackalhan on 1/14/17.
 */
public class Test {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Calculate Tax and Tip:
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tax + tip);

        System.out.println("The total meal cost is " + totalCost + " dollars.");


    }

}
