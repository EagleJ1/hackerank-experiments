package com.hackerrank.test.patterns.elemaninTeki.facade_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class FundsCheck {

    private double cashInAccount = 1000.0;

    public double getCashInAccount() {
        return cashInAccount;
    }

    private void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    private void increaseCashInAccount(double cashDeposit) {
        cashInAccount += cashDeposit;
    }

    public boolean haveEnoughMoney(double cashWithdrawn) {
        if (cashWithdrawn > getCashInAccount()) {
            System.out.println("Error: You do not have sufficient money in your account");
            System.out.println("Current Balance: " + getCashInAccount());
            return false;
        } else {
            decreaseCashInAccount(cashWithdrawn);
            System.out.println("Withdrawal Complete : Current Balance : " + getCashInAccount());

            return true;
        }
    }

    public void makeDeposit(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete : Current Balance : " + getCashInAccount());

    }
}
