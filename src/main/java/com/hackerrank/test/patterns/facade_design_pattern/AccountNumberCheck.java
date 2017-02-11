package com.hackerrank.test.patterns.facade_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class AccountNumberCheck {
    private int accountNumber = 1231151;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive(int accNumToCheck) {
        if (accNumToCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
