package com.hackerrank.test.patterns.chain_of_responsibility_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class AddNumbers implements Chain {

    private Chain nextChainTo;


    // Defines the next Object to receive the
    // data if this one can't use it

    @Override
    public void setNextChain(Chain nextChain) {
        nextChainTo = nextChain;
    }

    // Tries to calculate the data, or passes it
    // to the Object defined in method setNextChain()

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "add") {
            System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " + (request.getNumber1() + request.getNumber2()));
        } else {
            nextChainTo.calculate(request);
        }

    }
}
