package com.hackerrank.test.patterns.elemaninTeki.state_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class TestATMMachine {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
    }
}
