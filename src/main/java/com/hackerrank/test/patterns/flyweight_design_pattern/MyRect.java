package com.hackerrank.test.patterns.flyweight_design_pattern;

import java.awt.*;

/**
 * Created by jackalhan on 2/11/17.
 */
public class MyRect {

    private Color color;
    private int x, y, x2, y2;

    // WITH SHARE RECTANGULAR OBJECT

    public MyRect(Color color) {
        this.color = color;
    }

    public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY) {
        g.setColor(color);
        g.fillRect(upperX, upperY, lowerX, lowerY);
    }

    /*
    //WITHOUT SHARING RECTANGULAR OBJECT
    // Original forces creation of a rectangle every time

    public MyRect(Color color, int upperX, int upperY, int lowerX, int lowerY) {
        this.color = color;
        this.x = upperX;
        this.y = upperY;
        this.x2 = lowerX;
        this.y2 = lowerY;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, x2, y2);
    }
    */

}
