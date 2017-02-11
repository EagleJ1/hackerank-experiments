package com.hackerrank.test.patterns.proxy_design_pattern;

import com.hackerrank.test.patterns.proxy_design_pattern.HasCard;
import com.hackerrank.test.patterns.proxy_design_pattern.HasPin;
import com.hackerrank.test.patterns.proxy_design_pattern.NoCard;
import com.hackerrank.test.patterns.proxy_design_pattern.NoCash;

/**
 * Created by jackalhan on 2/11/17.
 */
//Context
public class ATMMachine implements GetATMData {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2000;

    boolean correctPinEntered = false;

    public ATMMachine() {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);
        atmState = noCard;

        if (cashInMachine < 0) {
            atmState = atmOutOfMoney;
        }
    }

    void setAtmState(ATMState newATMState) {
        atmState = newATMState;
    }

    public void setCashInMachine(int newCashInMachine) {
        cashInMachine = newCashInMachine;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void requestCash(int cashToWithdraw) {
        atmState.requestCash(cashToWithdraw);
    }

    public void insertPin(int pinEntered) {
        atmState.insertPin(pinEntered);
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }

    @Override
    public ATMState getATMData() {
        return atmState;
    }

    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }
}
