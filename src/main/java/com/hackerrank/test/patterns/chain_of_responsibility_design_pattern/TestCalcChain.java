package com.hackerrank.test.patterns.chain_of_responsibility_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class TestCalcChain {
    public static void main(String[] args) {

        // Here I define all of the objects in the chain
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new SubtractNumbers();
        Chain chainCal3 = new MultiplyNumbers();

        // Here I tell each object where to forward the
        // data if it can't process the request
        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);

        // Define the data in the Numbers Object
        // and send it to the first Object in the chain

        Numbers request = new Numbers(4, 3 , "mul");
        chainCal1.calculate(request);
    }
}
