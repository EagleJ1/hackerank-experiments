package com.hackerrank.test.patterns.elemaninTeki.state_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class HasPin implements ATMState {
    ATMMachine atmMachine;

    public HasPin(ATMMachine newAtmMachine) {
        atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can not enter more than one card");

    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Already Entered Pin");

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if (atmMachine.cashInMachine >= cashToWithdraw) {
            System.out.println(cashToWithdraw + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
        } else {
            System.out.println("Dont have that cash");
        }
        ejectCard();
        if (atmMachine.cashInMachine <= 0) {
            atmMachine.setAtmState(atmMachine.getNoCashState());
        }
    }
}
