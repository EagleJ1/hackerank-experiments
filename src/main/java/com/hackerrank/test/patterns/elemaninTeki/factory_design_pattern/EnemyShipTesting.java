package com.hackerrank.test.patterns.elemaninTeki.factory_design_pattern;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 2/9/17.
 */
public class EnemyShipTesting {

    public static void main(String[] args) {

        // METHOD 1 : TRADITIONAL METHOD, NOT A DYNAMIC WAY
        /*
        EnemyShip ufoShip = new UFOEnemyShip();
        doStuffEnemy(ufoShip);
        */

        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        String createEnemy = "";
        System.out.print("What type of ship? (U / R / B) : ");
        if (userInput.hasNextLine()) {
            createEnemy = userInput.nextLine();
        }

        //METHOD 2 : SEMI DYNAMIC WAY,
        //The problem is that, you need to do lots of if then cases to cover your different implementations.
        /*
        if (createEnemy.equals("U")) {
            theEnemy = new UFOEnemyShip();
        } else if (createEnemy.equals("R")) {
            theEnemy = new RocketEnemyShip();
        }
        */

        //METHOD 3 : FACTORY PATTERN WITH FULLY DYNAMICALLY
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        theEnemy = enemyShipFactory.makeEnemyShip(createEnemy);
        if (theEnemy != null)
            doStuffEnemy(theEnemy);
        else
            System.out.println("Enter a U, R, or B next time");
    }

    private static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
