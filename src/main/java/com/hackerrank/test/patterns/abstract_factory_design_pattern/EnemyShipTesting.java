package com.hackerrank.test.patterns.abstract_factory_design_pattern;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 2/9/17.
 */
public class EnemyShipTesting {

    public static void main(String[] args) {

        // EnemyShipBuilding handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation

        //EnemyShipBuilding makeShips = new
        //Enemy ship object
        /*EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.print("What type of ship? (U / R / B) : ");
        if (userInput.hasNextLine()) {
            String shipTypeIndicator = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(shipTypeIndicator);
            if (theEnemy != null)
                doStuffEnemy(theEnemy);
            else
                System.out.println("Enter a U, R, or B next time");

        }*/
    }

    private static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
    }

}
