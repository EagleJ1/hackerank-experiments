package com.hackerrank.test.patterns.mediator_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public interface Mediator {

    void saleOffer(String stock, int shares, int collCode);

    void buyOffer(String stock, int shares, int collCode);

    void addColleague(Colleague col1);

}
