package com.hackerrank.test.patterns.chain_of_responsibility_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class MultiplyNumbers implements Chain {

    private Chain nextChainTo;

    @Override
    public void setNextChain(Chain nextChain) {
        nextChainTo = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "mul") {
            System.out.println(request.getNumber1() + " x " + request.getNumber2() + " = " + (request.getNumber1() * request.getNumber2()));
        } else {
            System.out.println("Only works for addition , subtraction and multiplication at the moment, as long as we implement some other calculate methods. it can work well for them as well.");
        }

    }
}
