package com.hackerrank.test.patterns.elemaninTeki.adapter_design_pattern;

import java.util.Random;

/**
 * Created by jackalhan on 2/10/17.
 */
// This is the Adaptee. The Adapter sends method callsamp
// to objects that use the EnemyAttacker interface (for example EnemyTank)
// to the right methods defined in EnemyRobotToBeAdapted

public class EnemyRobotToBeAdapted {
    Random random = new Random();

    //Robot does not have any weapons but it can smash anything with its hands
    //it has hands, it makes sense to use adapter pattern to use this situation
    public void smashWithHands() {
        int attackDamage = random.nextInt(10) + 1;
        System.out.println("Enemy Robot causes " + attackDamage + " damage with its hands");
    }

    //since it is not moving as mentioned in interface, it walks forward
    // therefore it makes sense to use adapter design in order to align this with other interface.
    public void walkForward() {
        int movement = random.nextInt(5) + 1;
        System.out.println("Enemy Robot walks forward " + movement + " distance.");
    }

    // robot does not need any drive for having AI, but we still need to use same signature
    // to handle autonomous movement.
    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot is self driving wihout needs to " + driverName);
    }
}
