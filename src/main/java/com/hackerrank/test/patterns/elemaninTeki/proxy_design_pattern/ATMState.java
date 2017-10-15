package com.hackerrank.test.patterns.elemaninTeki.proxy_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
// We are going to define all of the ways that the user is going to be able to work our ATM machine.
public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);
}
