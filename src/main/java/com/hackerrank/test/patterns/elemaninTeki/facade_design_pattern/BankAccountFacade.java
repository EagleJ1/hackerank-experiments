package com.hackerrank.test.patterns.elemaninTeki.facade_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    //reference to other objects for information integrating.
    AccountNumberCheck accountChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundsCheck;
    WelcomeToBank bankWelcome;

    public BankAccountFacade(int newAccountNum, int newSecCode) {
        this.accountNumber = newAccountNum;
        this.securityCode = newSecCode;

        this.accountChecker = new AccountNumberCheck();
        this.codeChecker = new SecurityCodeCheck();
        this.fundsCheck = new FundsCheck();
        this.bankWelcome = new WelcomeToBank();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (accountChecker.accountActive(getAccountNumber())
                && codeChecker.isCodeCorrect(getSecurityCode())
                && fundsCheck.haveEnoughMoney(cashToGet)) {
            System.out.println("Transaction Completed \n");
        } else {
            System.out.println("Transaction Failed \n");
        }
    }

    public void depositCash(double cashToGive) {
        if (accountChecker.accountActive(getAccountNumber())
                && codeChecker.isCodeCorrect(getSecurityCode())
                ) {
            fundsCheck.makeDeposit(cashToGive);
            System.out.println("Transaction Completed \n");
        } else {
            System.out.println("Transaction Failed \n");
        }
    }

}
