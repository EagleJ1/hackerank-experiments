package com.hackerrank.test.patterns.elemaninTeki.abstract_factory_design_pattern;

import java.util.Scanner;

/**
 * Created by txcakaloglu on 2/9/17.
 */
public class EnemyShipTesting {

    public static void main(String[] args) {

        // EnemyShipBuilding handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation

        EnemyShipBuilding makeShips = new UFOEnemyShipBuilding();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.print("What type of ship? (U / B) : ");
        if (userInput.hasNextLine()) {
            String shipTypeIndicator = userInput.nextLine();
            theEnemy = makeShips.orderTheShip(shipTypeIndicator);
            if (theEnemy != null)
                System.out.println(theEnemy);
            else
                System.out.println("Enter a U, or B next time");

        }


    }

}
