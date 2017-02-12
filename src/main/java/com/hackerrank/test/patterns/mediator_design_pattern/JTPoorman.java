package com.hackerrank.test.patterns.mediator_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class JTPoorman extends Colleague {
    public JTPoorman(Mediator newMediator) {
        super(newMediator);

        System.out.println("JT Poorman signed up with the stock exchange\n");
    }
}
