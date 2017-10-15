package com.hackerrank.test.patterns.elemaninTeki;

/**
 * Created by jackalhan on 2/9/17.
 */
public class Bird extends Animal {

    public Bird() {
        super();
        setSound("Tweet");

        /* ***********************/
        /* STRATEGY PATTERNS    */
        /* ***********************/
        // We are going to add following method for StrategyPattern.
        // So POLYMORPHICALLY, we are setting flyingType for this class as FLY
        // basically, we are refering to FLYS interface but set it as a ITFLIES class
        flyingType = new ItFlys();
    }
}
