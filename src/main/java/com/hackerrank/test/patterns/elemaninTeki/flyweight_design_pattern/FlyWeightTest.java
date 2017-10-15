package com.hackerrank.test.patterns.elemaninTeki.flyweight_design_pattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by jackalhan on 2/11/17.
 */

// The Flyweight design pattern is used when you need to
// create a large number of similar objects
// To reduce memory this pattern shares Objects that are
// the same rather than creating new ones

public class FlyWeightTest extends JFrame {

    JButton startDrawing;
    int windowWidth = 1750;
    int windowHeight = 1500;

    Color[] shapeColor = {Color.orange, Color.red, Color.yellow, Color.blue, Color.pink, Color.cyan, Color.magenta, Color.black, Color.gray};

    public static void main(String[] args) {
        new FlyWeightTest();
    }

    public FlyWeightTest() {
        // Create the frame, position it and handle closing it

        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("FlyWeight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();
        startDrawing = new JButton("Draw Stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawingPanel.getGraphics();
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < 100000; ++i) {

                    /* TRADITIONAL WAY, WHICH TAKES LONGER TIME.
                    g.setColor(getRandColor());
                    g.fillRect(getRandX(), getRandY(), getRandX(), getRandY());*/

                    // We are going to build custom rectangular to accelerate program
                    /*MyRect rect = new MyRect(getRandColor(), getRandX(), getRandY(), getRandX(), getRandY());
                    rect.draw(g);*/

                    // WITH USING SARE COLORS
                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());

                }
                long endTime = System.currentTimeMillis();
                System.out.println("That took " + (endTime - startTime));
            }
        });

        this.add(contentPane);
        this.setVisible(true);
    }

    // Picks random x & y coordinates

    private int getRandY() {
        return (int) (Math.random() * windowHeight);
    }

    private int getRandX() {
        return (int) (Math.random() * windowWidth);
    }

    // Picks a random Color from the 9 available

    private Color getRandColor() {
        Random randomGenerator = new Random();
        int randIt = randomGenerator.nextInt(9);
        return shapeColor[randIt];

    }

}
