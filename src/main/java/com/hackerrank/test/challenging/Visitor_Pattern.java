package com.hackerrank.test.challenging;

import java.util.ArrayList;

/**
 * Created by jackalhan on 2/7/17.
 */
public class Visitor_Pattern {

    enum Color {
        RED, GREEN
    }

    static abstract class Tree {

        private int value;
        private Color color;
        private int depth;

        public Tree(int value, Color color, int depth) {
            this.value = value;
            this.color = color;
            this.depth = depth;
        }

        public Tree() {

        }

        public int getValue() {
            return value;
        }

        public Color getColor() {
            return color;
        }

        public int getDepth() {
            return depth;
        }

        public abstract void accept(TreeVis visitor);
    }

    class TreeNode extends Tree {

        private ArrayList<Tree> children = new ArrayList<>();

        public TreeNode(int value, Color color, int depth) {
            super(value, color, depth);
        }

        public void accept(TreeVis visitor) {
            visitor.visitNode(this);

            for (Tree child : children) {
                child.accept(visitor);
            }
        }

        public void addChild(Tree child) {
            children.add(child);
        }
    }

    static class TreeLeaf extends Tree {

        public TreeLeaf(int value, Color color, int depth) {
            super(value, color, depth);
        }

        public void accept(TreeVis visitor) {
            visitor.visitLeaf(this);
        }
        public TreeLeaf()
        {
            super();

        }
    }

    static abstract class TreeVis
    {
        public abstract int getResult();
        public abstract void visitNode(TreeNode node);
        public abstract void visitLeaf(TreeLeaf leaf);

    }

    static class SumInLeavesVisitor extends TreeVis {
        public int getResult() {
            //implement this
            return 0;
        }

        public void visitNode(TreeNode node) {
            //implement this
        }

        public void visitLeaf(TreeLeaf leaf) {
            //implement this
        }
    }

    static class ProductOfRedNodesVisitor extends TreeVis {
        public int getResult() {
            //implement this
            return 1;
        }

        public void visitNode(TreeNode node) {
            //implement this
        }

        public void visitLeaf(TreeLeaf leaf) {
            //implement this
        }
    }

    static class FancyVisitor extends TreeVis {
        public int getResult() {
            //implement this
            return 0;
        }

        public void visitNode(TreeNode node) {
            //implement this
        }

        public void visitLeaf(TreeLeaf leaf) {
            //implement this
        }
    }

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        return new TreeLeaf();
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
