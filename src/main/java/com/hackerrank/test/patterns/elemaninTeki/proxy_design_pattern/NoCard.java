package com.hackerrank.test.patterns.elemaninTeki.proxy_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class NoCard implements ATMState {
    ATMMachine atmMachine;

    public NoCard(ATMMachine newAtmMachine) {
        atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please Enter a PIN");
        atmMachine.setAtmState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Enter a card first");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Enter a card first");

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter a card first");

    }
}
