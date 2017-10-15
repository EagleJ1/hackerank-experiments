package com.hackerrank.test.patterns.elemaninTeki.prototype_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */

// By making this class cloneable you are telling Java that it is ok to copy instances of this class
// These instance copies have different results when System.identityHashCode(System.identityHashCode(bike))
// is called
public interface Animal extends Cloneable {
    Animal makeCopy();
}
