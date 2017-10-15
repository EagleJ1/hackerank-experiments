package com.hackerrank.test.patterns.elemaninTeki.chain_of_responsibility_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class SubtractNumbers implements Chain {

    private Chain nextChainTo;

    @Override
    public void setNextChain(Chain nextChain) {
        nextChainTo = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "sub") {
            System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = " + (request.getNumber1() - request.getNumber2()));
        } else {
            nextChainTo.calculate(request);
        }
    }
}
