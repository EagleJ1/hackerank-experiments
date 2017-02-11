package com.hackerrank.test.patterns.state_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class HasCard implements ATMState {
    ATMMachine atmMachine;

    public HasCard(ATMMachine newAtmMachine) {
        atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        if (pinEntered == 1234) {
            System.out.println("Correct Pin");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getHasPin());
        } else {
            System.out.println("Wrong Pin");
            atmMachine.correctPinEntered = false;
            atmMachine.setAtmState(atmMachine.getHasPin());
            ejectCard();

        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter PIN First");
    }
}
