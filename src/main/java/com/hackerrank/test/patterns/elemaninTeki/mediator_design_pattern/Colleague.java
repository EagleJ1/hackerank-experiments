package com.hackerrank.test.patterns.elemaninTeki.mediator_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public abstract class Colleague {

    private Mediator mediator;
    private int colleagueCode;

    public Colleague(Mediator newMediator) {
        mediator = newMediator;
        mediator.addColleague(this);

    }

    public void saleOffer(String stock, int shares) {
        mediator.saleOffer(stock, shares, this.colleagueCode);
    }

    public void buyOffer(String stock, int shares) {
        mediator.buyOffer(stock, shares, this.colleagueCode);
    }

    public void setColleagueCode(int newColleagueCode) {
        colleagueCode = newColleagueCode;
    }


}
