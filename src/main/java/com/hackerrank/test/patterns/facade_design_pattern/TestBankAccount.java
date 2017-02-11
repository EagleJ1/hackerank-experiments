package com.hackerrank.test.patterns.facade_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class TestBankAccount {

    public static void main(String[] args) {
        BankAccountFacade accesingBank = new BankAccountFacade(1231151, 1231);
        accesingBank.withdrawCash(50.00);
        accesingBank.withdrawCash(900.00);
        accesingBank.depositCash(200.00);
    }

}
