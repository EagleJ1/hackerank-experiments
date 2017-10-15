package com.hackerrank.test.patterns.elemaninTeki;

/**
 * Created by jackalhan on 2/8/17.
 */
public class Dog extends Animal {

    public void digHole() {
        System.out.println("Dug a hole");
    }

    public Dog() {
        super();
        setSound("Bark");

        /* ***********************/
        /* STRATEGY PATTERNS    */
        /* ***********************/
        // We are going to add following method for StrategyPattern.
        // So POLYMORPHICALLY, we are setting flyingType for this class as CantFly
        // basically, we are refering to FLYS interface but set it as a CANTFLY class
        flyingType = new CantFly();
    }

    public void changeVar(int randNum) {
        randNum = 12;
        System.out.println("randNum in method: " + randNum);
    }


}
